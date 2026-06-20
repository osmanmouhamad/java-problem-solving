package Problemslvl2;

import java.util.Scanner;

public class ReplaceWordInString {
	public static String readString(String message, Scanner scan) {
        String text;

        do {
            System.out.print(message);
            text = scan.nextLine();
        } while (text.trim().isEmpty());

        return text;
    }
	public static String replaceWords(String s, String sToReplace, String sReplaceTo) {
		String [] words = s.split(" ");
		String result = "";
		for(int i = 0 ;i<words.length;i++) {
			if(words[i].equalsIgnoreCase(sToReplace)) {
			words[i]=sReplaceTo;	
			}
		}
		for(int i = 0;i<words.length ;i++) {
        	result+=words[i] + " ";
        }
        return result.trim();
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text = readString("Enter your text :  ", scan);
		String toReplace = readString("Enter the word you want to replace : ", scan).trim();
		String replaceTo = readString("Enter the word you want to replace to : ", scan).trim();
		System.out.println(replaceWords(text,toReplace,replaceTo));
		
	}
}
