package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Fun with Math!");
        System.out.println("Please enter a number:");
        String inputOne = scanner.nextLine();
        double firstNum = Double.parseDouble(inputOne);

        System.out.println("Please enter another number:");
        String inputTwo = scanner.nextLine();
        double secondNum = Double.parseDouble(inputTwo);

        double sum = firstNum + secondNum;
        double difference = firstNum - secondNum;
        double division = firstNum / secondNum;
        double multiplication = firstNum * secondNum;
        double remainder = firstNum % secondNum;

        showResults(sum, difference, division, multiplication, remainder);

    }

    public static void showResults (double sum, double difference, double division, double multiplication, double remainder) {
        System.out.println("The sum is: " + sum);
        System.out.println("The difference is: " + difference);
        System.out.println("The quotient is: " + division);
        System.out.println("The product is: " + multiplication);
        System.out.println("The remainder is: " + remainder);
    }
}
