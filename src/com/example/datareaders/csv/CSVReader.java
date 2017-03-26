package com.example.datareaders.csv;

import com.example.datareaders.DataReader;

import java.io.FileNotFoundException;
import java.io.IOException;

import static java.lang.Integer.parseInt;

/**
 * Created by simonyan_51 on 25.03.2017.
 */
public class CSVReader extends DataReader {

    private int[] numbers;
    public static final String EXTENTION = "csv";

    public CSVReader(String src) throws IOException {
        super(src);
        this.numbers = this.seperateNumbers(getReadedFile());
    }

    @Override
    public int[] seperateNumbers(String getReadedFile) {
        String[] numbers = getReadedFile.split(",");

        int[] parsedNumber = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            parsedNumber[i] = Integer.parseInt(numbers[i].trim());
        }
        return parsedNumber;
    }

    @Override
    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }
}
