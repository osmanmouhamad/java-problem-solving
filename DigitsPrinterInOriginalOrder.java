package Problemslvl1;

import java.util.Scanner;

public class DigitsPrinterInOriginalOrder {
	public static int Ispositivenum(String s) {
		Scanner scan = new Scanner(System.in);
		int a ;
		do {
			System.out.println(s);
			a= scan.nextInt();
		}while(a<=0);
		return a;
	}
	public static int Reversenum(int n) {
		int num=0 ;
		int num1=0;
		while(n>0) {
			num = n%10; 
			n/=10;
			num1=num1*10+num;
		}
		return num1;
		}
	public static void PrintNumber(int num1) {
		int num=0 ;
		while(num1>0) {
			num = num1%10;
			System.out.println(num);
			num1/=10;
		}
	}
	public static void main(String[] args) {
		PrintNumber(Reversenum(Ispositivenum("enter a positive num: ")));
	}
}
