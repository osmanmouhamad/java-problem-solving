package Problemslvl1;
import java.util.Scanner;

public class PerfectNumbersPrinter {
	public static int Ispositivenum(String s) {
		Scanner scan = new Scanner(System.in);
		int a ;
		do {
			System.out.println(s);
			a= scan.nextInt();
		}while(a<0);
		return a;
	}
	public static boolean IsPerfectnum(int n) {
		int sum = 0;
		for(int i =1 ;i<=n/2;i++) {
			if (n%i==0) {
				sum+=i;
			}
			
		}
		return (sum==n);
	} 
	public static void Perfectnum(int n) {
		for(int i =1;i<=n;i++) {
			if(IsPerfectnum(i)) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		Perfectnum(Ispositivenum("enter a positive num: "));
		 ;
	}
	}
