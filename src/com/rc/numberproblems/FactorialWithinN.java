package com.rc.numbers;

import java.util.Scanner;

public class FactorialWithinN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
            System.out.println(i + "! = " + fact);
        }
    }
}