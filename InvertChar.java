package Problemslvl2;

import java.util.Scanner;

public class InvertChar {

	public static char readChar(String s, Scanner scan) {
		System.out.println(s);
		return scan.next().charAt(0);

	}

	public static char invertCaseChar(char c) {
		return Character.isLowerCase(c)?Character.toUpperCase(c):Character.toLowerCase(c);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char a = readChar("enter a character you neeed to inverted : ", scan);
		System.out.println("the inverted case of this char is : " + invertCaseChar(a));
		scan.close();
	}
}