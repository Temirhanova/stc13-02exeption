package ru.innopolis.stc13.exeption.tsf;

public class Simple {
    public static void main(String[] args) {
        System.out.println("Program strated");
        Calculator calculator = new Calculator();
        System.out.println(calculator.divide(6, 0));
//
//        try {
//            System.out.println("try block started");
//            int a = 10 / 0;
//        } catch (ArithmeticException e) {
//            System.out.println("catch started");
//            e.printStackTrace();
//            throw new NullPointerException();
//        } catch (NullPointerException e) {
//            System.out.println("Catch NPE Started");
//            e.printStackTrace();
//            System.out.println("end NPE catch");
//        } catch (Exception e) {
//            System.out.println("Start exeption catch");
//            e.printStackTrace();
//            System.out.println("Ent exeption catch");
//        } finally {
//            System.out.println("Start finally");
//            System.out.println("End finally");
//        }
        System.out.println("End program");
    }
}
