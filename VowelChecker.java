package Problemslvl2;

import java.util.Scanner;

public class VowelChecker {
	public static char readChar(String s, Scanner scan) {
		System.out.println(s);
		return scan.next().charAt(0);
	}

	public static boolean isVowel(char c) {
		char ch = Character.toLowerCase(c);
		return (ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u');
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char c = readChar("Enter a Char to Compaire if it vowel : ", scan);
		if (isVowel(c)) {
			System.out.println("The letter " + c + " is a vowel");
		} else
			System.out.println("The letter " + c + " isn't a vowel");
		scan.close();
	}
	
}
