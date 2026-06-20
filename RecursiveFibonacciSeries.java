package Problemslvl2;

import java.util.Scanner;

public class RecursiveFibonacciSeries {
	public static int readPositiveNumber(String s , Scanner scan) {
		int a ;
		do {
			System.out.println(s);
			a= scan.nextInt();
		}while(a<=0);
		return a;
	}
	public static void generateFibonacciUsingRecursion(int num,int first, int second ) {
		int next = 0;
	if(num>0) {
		next=first+second;
		first=second;
		second=next;
		System.out.print(first+" "); 
		generateFibonacciUsingRecursion(num-1,first,second);
	}
	}
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	generateFibonacciUsingRecursion(readPositiveNumber("enter a positive number :", scan), 0, 1);
	scan.close();
}
}
