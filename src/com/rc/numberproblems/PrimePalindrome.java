package com.rc.numberproblems;

import java.util.Scanner;

public class PrimePalindrome {

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static boolean isPalindrome(int n) {
        int temp = n;
        int rev = 0;

        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

        return temp == rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (isPrime(n) && isPalindrome(n))
            System.out.println("Prime Palindrome Number");
        else
            System.out.println("Not a Prime Palindrome Number");
    }
}