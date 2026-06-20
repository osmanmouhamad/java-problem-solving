package Problemslvl2;

import java.util.Scanner;

public class CountVowel {
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
public static int countVowels(String s) {
	int counter = 0 ;
	for(int i = 0 ; i < s.length();i++) {
		if(isVowel(s.charAt(i))) {
			counter++;
		}
	}
	return counter;
}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text = readString("Enter your Text : ", scan);
		System.out.println("The text contains "+ countVowels(text)+" vowels");
		scan.close();
	}
	
}
