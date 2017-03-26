package com.example.datareaders.nlsv;

import com.example.datareaders.DataReader;

import java.io.IOException;

import static java.lang.Integer.parseInt;

/**
 * Created by simonyan_51 on 25.03.2017.
 */
public class NLSVReader extends DataReader {

    public static final String EXTENTION = "nlsv";

    private int[] numbers;

    public NLSVReader(String src) throws IOException {
        super(src);
        this.numbers = this.seperateNumbers(getReadedFile());
    }

    @Override
    public int[] seperateNumbers(String getReadedFile) {
        String[] numbers = getReadedFile.split("\n");
        int[] parsedNumber = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            parsedNumber[i] = Integer.parseInt(numbers[i]);
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
