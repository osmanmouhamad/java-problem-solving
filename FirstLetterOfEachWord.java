package Problemslvl2;

import java.util.Scanner;

public class FirstLetterOfEachWord {
	public static String readString(String s , Scanner scan) {
		String a ;
		do {
			System.out.println(s);
			a= scan.nextLine();
		}while(a.trim().isEmpty());
		return a;
	}
	public static void printFirstLetterOfEachWord(String s) {
	boolean	isFirstLetter = true;
	for(int i = 0;i<s.length();i++) {
		if(s.charAt(i) != ' '  && isFirstLetter)
		System.out.print(s.charAt(i)+" ");
		isFirstLetter=(s.charAt(i)==' ');
	}
	
	}
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		printFirstLetterOfEachWord(readString("enter a String : ", Scan));
		Scan.close();
	}
}
