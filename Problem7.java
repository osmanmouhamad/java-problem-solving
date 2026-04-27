package Problemslvl1;

import java.util.Scanner;

public class Problem7 {
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
		int num2=0;
		while(n>0) {
			num = n%10; 
			n/=10;
			num2=num2*10+num;
		}
		System.out.print(num2);
		}
	public static void main(String[] args) {
		Reversenum(Ispositivenum("enter a positive num: "));
	}
}
