package com.rc.numbers;

class Palindrome100to1000 {
    public static void main(String[] args) {

        for (int i = 100; i <= 1000; i++) {
            int num = i;
            int rev = 0;

            while (num > 0) {
                int rem = num % 10;
                rev = rev * 10 + rem;
                num = num / 10;
            }

            if (i == rev) {
                System.out.print(i + " ");
            }
        }
    }
}
