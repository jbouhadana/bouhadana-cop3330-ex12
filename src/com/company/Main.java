/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jeremy Bouhadana
 */
package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner jb = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        double principal = jb.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double interestRate = jb.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = jb.nextInt();

        double interestDec = interestRate / 100;
        double A = principal * (1 + interestDec*years);

        System.out.printf("After %d years at %.2f%%, the investment will be worth $%.2f", years, interestRate, A);
    }
}
