package com.rc.numberproblems;

import java.util.Scanner;

public class Divisible {

    static void checkDivisible(int n) {
        if (n % 3 == 0 && n % 5 == 0)
            System.out.println("Divisible by both 3 and 5");
        else if (n % 3 == 0)
            System.out.println("Divisible by 3");
        else if (n % 5 == 0)
            System.out.println("Divisible by 5");
        else
            System.out.println("Not divisible by 3 or 5");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        checkDivisible(n);
    }
}