package com.example.Calculate;

/**
 * Created by simonyan_51 on 25.03.2017.
 */
public abstract class Calculate {
    private int[] numbers;
    public Calculate(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public abstract int action();
}
