package Problemslvl2;

import java.util.Scanner;

public class StringCounter {

	public static String readString(String s, Scanner scan) {
		String a;
		do {
			System.out.println(s);
			a = scan.nextLine();
		} while (a.trim().isEmpty());

		return a;
	}

	public static int lengthCounter(String s) {
		return s.length();
	}

	public static int countCapitalLetters(String s) {
		int counter = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i))) {
				counter++;
			}
		}
		return counter;
	}

	public static int countSmallLetters(String s) {
		int counter = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLowerCase(s.charAt(i))) {
				counter++;
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String text = readString(("Enter a String:"), scan);
		System.out.println("String lenght is : " + lengthCounter(text));
		System.out.println("Number of Capital letter is : " + countCapitalLetters(text));
		System.out.println("Number of Small letter is : " + countSmallLetters(text));
		scan.close();
	}
}