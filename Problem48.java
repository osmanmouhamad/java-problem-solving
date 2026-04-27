package Problemslvl1;

import java.util.Scanner;

public class Problem48 {
	public static float Getfraction(float number) {
		return number - (int)number;
	}
	public static int Myfloor(float number) {
		if(number>0) {
			return (int)number;
		}
		else
			return (int)number - 1;
		
		
	    }
	public static float readNumber(Scanner scan) {
        System.out.print("Please enter a float number: ");
        return scan.nextFloat();
    }

    // Main function
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float number = readNumber(scan);

        System.out.println("My floor Result : " + Myfloor(number));
        System.out.println("Java floor Result: " + Math.floor(number));

        scan.close();
    }
}
	

