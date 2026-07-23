package com.rc.numbers;

import java.util.Scanner;

public class StrongNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int sum=0;
	while(num>0)
	{
		sum=sum+getFactorial(num%10);
		num=num/10;
	}
	if(num==sum) {
		System.out.println("Its a Strong number");
	}
	else {
		System.out.println("It is not a Strong number");
	}
	
}
public static int getFactorial(int num) {
	int fact=1;
	while(num>0) {
		fact=fact*num;
		num--;
	}
	return fact;
}
}
