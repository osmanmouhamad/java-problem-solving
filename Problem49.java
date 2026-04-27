package Problemslvl1;

import java.util.Scanner;

public class Problem49 {
	public static float readNumber(Scanner scan) {
        System.out.print("Please enter a float number: ");
        return scan.nextFloat();
    }
	public static int Myceil(float number) {
		if(number>0) {
			return (int)number +1;
		}
		else
			return (int)number ;
		
		
	    }
	  public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);

	        float number = readNumber(scan);

	        System.out.println("My ceil Result : " + Myceil(number));
	        System.out.println("Java floor Result: " + Math.ceil(number));

	        scan.close();
	    }
}
