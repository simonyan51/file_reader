package com.example.Calculate;

/**
 * Created by simonyan_51 on 26.03.2017.
 */
public class Action2 extends Calculate {
    public Action2(int[] numbers) {
        super(numbers);
    }

    public int action() {
        int action = 1;
        for (int i = 0; i < getNumbers().length; i++) {
            action *= getNumbers()[i];
        }
        return action;
    }
}
