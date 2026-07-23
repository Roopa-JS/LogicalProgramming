package com.rc.numbers;

import java.util.Scanner;

class SumPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0, temp = n;

        while (temp > 0) {
            sum = sum + temp % 10;
            temp = temp / 10;
        }

        int count = 0;
        for (int i = 1; i <= sum; i++) {
            if (sum % i == 0) {
                count++;
            }
        }

        if (count == 2)
            System.out.println("Sum of digits = " + sum + " is Prime");
        else
            System.out.println("Sum of digits = " + sum + " is Not Prime");
    }
}