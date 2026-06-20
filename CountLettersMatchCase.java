package Problemslvl2;

import java.util.Scanner;

public class CountLettersMatchCase {
	public static String readString(String s, Scanner scan) {
		String a;
		do {
			System.out.println(s);
			a = scan.nextLine();
		} while (a.trim().isEmpty());

		return a;
	}

	public static char readChar(String s, Scanner scan) {
		System.out.println(s);
		return scan.next().charAt(0);
	}

	public static char invertCaseChar(char c) {
		return Character.isLowerCase(c) ? Character.toUpperCase(c) : Character.toLowerCase(c);
	}

	public static int countLettersMatchCase(String s, char c, boolean matchCase) {

		int counter = 0;
		for (int i = 0; i < s.length(); i++) {

			if (matchCase) {
				if (c == s.charAt(i))
					counter++;
			} else {
			    if (Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(c)) {
			        counter++;
			    }
			}
		}

		return counter;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = readString("Enter a String : ", scan);
		char c = readChar("Enter a char", scan);
		System.out.println("letter " + c + " Count = " + countLettersMatchCase(s, c, true));
		System.out.println(
				"letter " + c + " and " + invertCaseChar(c) + " Count = " + countLettersMatchCase(s, c, false));
		scan.close();
	}

}
