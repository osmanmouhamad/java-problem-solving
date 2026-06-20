package Problemslvl2;

import java.util.Scanner;

public class ReverseWords {
	public static String readString(String message, Scanner scan) {
        String text;

        do {
            System.out.print(message);
            text = scan.nextLine();
        } while (text.trim().isEmpty());

        return text;
    }
	public static String reverseWords(String s) {
		String [] words = s.split(" ");
		String result = "";
        for(int i = words.length - 1;i>=0;i--) {
        	result+=words[i] + " ";
        }
        return result.trim();
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text = readString("Enter your text :  ", scan);
		System.out.println(reverseWords(text));
		
	}
}
