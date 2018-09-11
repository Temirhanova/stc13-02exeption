package ru.innopolis.stc13.exeption.exeptions;

public class Main {
    public static void main(String[] args) {
        double res = 0;
        try {
            res = divider(2, 4);
        } catch (MyAriphimeticExeption e) {
            res = specialCaseFor3(6, 3);
        } finally {
            System.out.println(res);
        }
    }

    static double divider(int a, int b) throws MyAriphimeticExeption {
        if (b % 3 == 0) {
            throw new MyAriphimeticExeption("3");
        } else {
            if (b != 0) {
                return a / b;
            } else {
                return 0;
            }
        }
    }

    static double specialCaseFor3(int a, int b) {
        System.out.println("Some special case");
        return a / b / 2;
    }
}
