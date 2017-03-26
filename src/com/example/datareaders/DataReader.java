package com.example.datareaders;

import java.io.*;
import java.lang.*;
import java.util.Scanner;

/**
 * Created by simonyan_51 on 25.03.2017.
 */
public abstract class DataReader {
    private String readedFile = "";
    private BufferedReader read;
    private FileReader file;

    protected DataReader(String src) throws IOException {
        this.file = new FileReader(src);
        this.read = new BufferedReader(file);
        this.readedFile = this.readFile(this.read);
    }

    private String readFile(BufferedReader read) throws IOException {
        String line = read.readLine();
            while(line != null) {
                this.readedFile += line;
                line = read.readLine();
            }
            this.file.close();
            return this.readedFile;
    }

    public String getReadedFile() {
        return readedFile;
    }


    public abstract int[] seperateNumbers(String readedFile);

    public abstract int[] getNumbers();
}
