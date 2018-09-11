package ru.innopolis.stc13.exeption;

public class Main {
    public static void main(String[] args) {
        long sum = 0;
        for (int i = 0; i < 10_000_000; i++) {
            sum += i;
            if (i % 1000 == 0) {
                System.out.println(sum);
            }
        }
    }


}
