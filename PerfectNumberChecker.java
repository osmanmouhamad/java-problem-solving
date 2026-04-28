package Problemslvl1;
import java.util.Scanner;

public class PerfectNumberChecker {
	public static int Ispositivenum(String s) {
		Scanner scan = new Scanner(System.in);
		int a ;
		do {
			System.out.println(s);
			a= scan.nextInt();
		}while(a<0);
		return a;
	}
	public static void Perfectnum(int n) {
		int sum = 0;
		for(int i =1 ;i<=n/2;i++) {
			if (n%i==0) {
				sum+=i;
			}
			
		}if(sum==n) {
				System.out.println(n +" is a perfect number");
			}else 
				System.out.println(n +" is not a perfect number");
	} 
	public static void main(String[] args) {
		Perfectnum(Ispositivenum("enter a positive num"));
		 ;
	}
	}
