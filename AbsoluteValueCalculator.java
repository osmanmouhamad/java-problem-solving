package Problemslvl1;

import java.util.Scanner;

public class AbsoluteValueCalculator {
	public static double Readnumber(String s,Scanner scan) {
		System.out.print(s);
		int a = scan.nextInt();
		return a;
	}
public static double Myabs(double n) {
	if(n<0) {
		return n*-1;
	}
	return n;
}
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	double n = Readnumber("enter a number ",scan);
	System.out.println(Myabs(n));
	System.out.println(Math.abs(n));
}
}
