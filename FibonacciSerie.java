package Problemslvl2;

import java.util.Scanner;

public class FibonacciSerie {
	public static int readPositiveNumber(String s , Scanner scan) {
		int a ;
		do {
			System.out.println(s);
			a= scan.nextInt();
		}while(a<=0);
		return a;
	}
	public static void generateFibonacci(int a ) {
		int first = 1 ;
		int second = 1;
		int next = 0;
		for (int i =1 ; i <= a ;i++) 
		{System.out.print(first+" ");
			next = first + second ;
			first = second;
			second = next ; 
			
		}
		
	}
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	generateFibonacci(readPositiveNumber("Enter the number of Fibonacci terms:", scan));
	scan.close();
}
}
