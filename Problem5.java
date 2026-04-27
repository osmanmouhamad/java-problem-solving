package Problemslvl1;

import java.util.Scanner;

public class Problem5 {
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
		int num=0 ;
		while(n>0) {
			num = n%10;
			System.out.println(num);
			n/=10;
		}
		}
	public static void main(String[] args) {
		Reversenum(Ispositivenum("enter a positive num: "));
	}
}
