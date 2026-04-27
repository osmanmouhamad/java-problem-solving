package Problemslvl1;

import java.util.Scanner;

public class Problem11 {
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
		int num2=0;
		while(n>0) {
			num = n%10; 
			n/=10;
			num2=num2*10+num;
		}
		return num2;
		}
	public static boolean Ispalinadorme(int n) {
		return n == Reversenum(n);
	}
	public static void main(String[] args) {
		if (Ispalinadorme(Ispositivenum("enter a positive num: "))) {
			System.out.println("Yes, it's a palinadorme num");
		}else
		{
			System.out.println("No,it's not a plaidanorme num");
		}
	}
}
