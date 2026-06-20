package Problemslvl2;

import java.util.Scanner;

public class CountLetter {
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
	public static int countLetter (String s , char c) {
		int counter=0;
		for(int i =0 ; i<s.length();i++) {
			if(c==s.charAt(i)) {
				counter++;
			}
		}
		return counter;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = readString("Enter a String : ", scan);
		char c = readChar("Enter a char", scan);
		System.out.println("letter "+ c + " Count = "+ countLetter(s, c));
	}
	
}
