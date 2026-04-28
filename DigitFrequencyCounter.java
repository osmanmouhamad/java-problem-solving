package Problemslvl1;

import java.util.Scanner;

public class DigitFrequencyCounter {
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
	public static void main(String[] args) {
		int n = Ispositivenum("enter a positive number:");
		int a = Ispositivenum("enter a positive number:");
		System.out.println("Digts "+a+" Frequency is "+ DigtsFrequency(a, n) +" Times");
	}
}
