package com.rc.numbers;

import java.util.Scanner;

public class EvenOdd {
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a number:");
			int n=sc.nextInt();
			if(n%2==0)
			{
				System.out.println("it is even no");
			}
			else
			{
				System.out.println("it is not even no");
			}

	}
}


