package Problemslvl1;

import java.util.Scanner;

public class InvertedNumberPattern {
	public static int Ispositivenum(String s) {
		Scanner scan = new Scanner(System.in);
		int a ;
		do {
			System.out.println(s);
			a= scan.nextInt();
		}while(a<=0);
		return a;
	}
public static void Invertedpatternnumber(int n) {
	for (int i = n ;i>=1;i--) {
		for (int j=1;j<=i;j++) {
			System.out.print(i);
		}
		System.out.println();
	}
}
public static void main(String[] args) {
	Invertedpatternnumber(Ispositivenum("enter a number positive: "));
}
}
