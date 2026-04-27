package Problemslvl1;
import java.util.Scanner;
public class Problem2 {
	public static int Ispositivenum(String s) {
		Scanner scan = new Scanner(System.in);
		int a ;
		do {
			System.out.println(s);
			a= scan.nextInt();
		}while(a<0);
		return a;
	}
	public static boolean Checkprime(int a) {
		int sum = 0;
		for(int i = 1;i<=a;i++) {
			if(a % i==0) {
				sum+=1;
			}
		}
		return (sum==2);
	}
	public static void primenum(int n) {
		for(int i =1;i<=n;i++) {
			if(Checkprime(i)) {
				System.out.println(i+" ");
			}
		}
	}
	public static void main(String[] args) {
		primenum(Ispositivenum("enter a positive num"));
	}
	}
