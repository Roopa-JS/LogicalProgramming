package com.rc.numberproblems;

import java.util.Scanner;

public class LeapYear {

    static void checkLeap(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        checkLeap(year);
    }
}