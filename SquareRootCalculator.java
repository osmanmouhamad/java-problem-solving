package Problemslvl1;

import java.util.Scanner;

public class SquareRootCalculator {
	public static double readNumber(Scanner scan) {
        System.out.print("Please enter a float number: ");
        return scan.nextFloat();
    }
	public static double Mysqrt(double number) {
		return Math.pow(number, 0.5);
	}
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double number = readNumber(scan);

        System.out.println("My ceil Result : " + Mysqrt(number));
        System.out.println("Java floor Result: " + Math.sqrt(number));

        scan.close();
    }
}
