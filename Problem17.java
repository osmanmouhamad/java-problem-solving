package Problemslvl1;

import java.util.Scanner;

public class Problem17 {
	public static String ReadPassword(String a) {
		Scanner scan = new Scanner(System.in);
		System.out.println(a);
		String s = scan.nextLine();
		return s;
	}
	public static void FindPassword(String s) {
	    int count = 0;
	    boolean found = false;  // flag to indicate if password is found

	    for (int i = 65; i <= 90; i++) {
	        for (int j = 65; j <= 90; j++) {
	            for (int k = 65; k <= 90; k++) {
	                String word = "" + (char)i + (char)j + (char)k;
	                count++;
                     System.out.println("Trial["+(count)+"]" + word);
	                if (s.equals(word)) {
	                    System.out.println("I found your password after " + count + " tries: " + word);
	                    found = true;
	                    break;  // stop innermost loop
	                }
	            }
	            if (found) break;  // stop middle loop
	        }
	        if (found) break;  // stop outer loop
	    }

	    if (!found) {
	        System.out.println("I can't find your password");
	    }
	}

public static void main(String[] args) {
		FindPassword(ReadPassword("enter your password: "));
	}

}
