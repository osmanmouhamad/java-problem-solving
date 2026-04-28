package Problemslvl1;

import java.util.Scanner;

public class SumOfDigitsCalculator {
	public static int Ispositivenum(String s) {
		Scanner scan = new Scanner(System.in);
		int a ;
		do {
			System.out.println(s);
			a= scan.nextInt();
		}while(a<=0);
		return a;
	}
	public static void Reversenum(int n) {
		int sum=0 ;
		while(n>0) {
			int num = n%10;
			n/=10;
			sum+=num;
			
		}
		System.out.println(sum);
		}
	public static void main(String[] args) {
		Reversenum(Ispositivenum("enter a positive num: "));
	}
}
