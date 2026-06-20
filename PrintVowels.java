package Problemslvl2;

import java.util.Scanner;

public class PrintVowels {
	public static String readString(String s, Scanner scan) {
        String a;
        do {
            System.out.println(s);
            a = scan.nextLine();
        } while (a.trim().isEmpty());

        return a;
    }
	public static boolean isVowel(char c) {
		char ch = Character.toLowerCase(c);
		return (ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u');
	}
	public static void printVowels(String s) {
		System.out.print("Vowels in this text are : ");
		for(int i = 0 ; i<s.length();i++) {
			if(isVowel(s.charAt(i))) {
				System.out.print(s.charAt(i)+" ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text = readString("Enter your text: ", scan);
		printVowels(text);
		scan.close();
	}
	
}
