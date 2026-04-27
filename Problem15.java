package Problemslvl1;

import java.util.Scanner;

public class Problem15 {
	public static int Ispositivenum(String s) {
		Scanner scan = new Scanner(System.in);
		int a ;
		do {
			System.out.println(s);
			a= scan.nextInt();
		}while(a<=0);
		return a;
	}
public static void Letterpatternnumber(int n) {
	for (int i = 65  ;i<=65+(n-1);i++) {
		for (int j=65;j<=i;j++) {
			System.out.print((char)i);
		}
		System.out.println();
	}
}
public static void main(String[] args) {
	Letterpatternnumber(Ispositivenum("enter a number positive: "));
}
}
