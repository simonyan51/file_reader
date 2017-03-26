package com.example.client;
import com.example.Calculate.Action1;
import com.example.Calculate.Action2;
import com.example.Calculate.Action3;
import com.example.Calculate.Calculate;
import com.example.datareaders.DataReader;
import com.example.datareaders.csv.CSVReader;
import com.example.datareaders.nlsv.NLSVReader;
import com.example.datareaders.tsv.TSVReader;

import java.io.IOException;
import java.lang.*;
import java.util.Scanner;

/**
 * Created by simonyan_51 on 25.03.2017.
 */
public class Client {
    private String format;
    private String fileSource;
    private DataReader reader;
    private Calculate calc;
    private String action;

    public void start() throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter File Source: ");
        fileSource = input.nextLine();
        System.out.println("Enter Action Id: 1. 2. 3");
        this.action = input.nextLine();
        read(fileSource);
        System.out.println(action());
    }

    private void read(String src) throws IOException {
        String[] fileFormat = src.split("\\.");
        format = fileFormat[fileFormat.length - 1];
        switch(format) {
            case CSVReader.EXTENTION: reader = new CSVReader(src); break;
            case TSVReader.EXTENTION: reader = new TSVReader(src); break;
            case NLSVReader.EXTENTION: reader = new NLSVReader(src); break;
            default: System.out.println("Invalid File Format");
        }
    }
    public int action() {
        if (action.equals("1")) {
            calc = new Action1(reader.getNumbers());
            return calc.action();
        } else if (action.equals("2")) {
            calc = new Action2(reader.getNumbers());
            return calc.action();
        } else if (action.equals("3")) {
            calc = new Action3(reader.getNumbers());
            return calc.action();
        }
        return 0;
    }
}
