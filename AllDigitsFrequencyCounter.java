package Problemslvl1;

import java.util.Scanner;

public class AllDigitsFrequencyCounter {
	public static int Ispositivenum(String s) {
		Scanner scan = new Scanner(System.in);
		int a ;
		do {
			System.out.println(s);
			a= scan.nextInt();
		}while(a<=0);
		return a;
	}
	public static int DigtsFrequency(int a,int n) {
		int num=0 ;
		int sum=0;
		while(n>0) {
			num = n%10;
			
			n/=10;
			if(a==num) {
				sum+=1;
			}
			
		}
		return sum;
		}
	public static void Printdigits(int n) {
		for(int i=1;i<=9;i++) {
			if(DigtsFrequency(i, n)!=0) {
			System.out.println("Digts "+i+" Frequency is "+ DigtsFrequency(i, n) +" Times");
			}
		}
	}
	public static void main(String[] args) {
		int n = Ispositivenum("enter a positive number:");
		Printdigits(n);
	}
}
