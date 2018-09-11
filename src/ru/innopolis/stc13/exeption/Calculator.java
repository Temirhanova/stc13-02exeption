package ru.innopolis.stc13.exeption;

public class Calculator {
    public double divide(int a, int b) throws Exception {
        if (b != 0) {
            return a / b;
        } else {
            throw new Exception("don't send me a zero!");
        }
    }
}
