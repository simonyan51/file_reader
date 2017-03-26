package com.example.Calculate;

/**
 * Created by simonyan_51 on 26.03.2017.
 */
public class Action3 extends Calculate {
    public Action3(int[] numbers) {
        super(numbers);
    }
    public int action() {
        int result = 0;
        for (int i = 0; i < getNumbers().length; i++) {
            result -= getNumbers()[i];
        }
        return result;
    }
}
