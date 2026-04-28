package Problemslvl1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class LicenseKeysArrayGenerator {
	
	public static int Ispositivenum(String s) {
		Scanner scan = new Scanner(System.in);
		int a ;
		do {
			System.out.println(s);
			a= scan.nextInt();
		}while(a<=0);
		return a;
	}

    public static int randomNumber(int from, int to) {
        Random rand = new Random();
        return rand.nextInt(to - from + 1) + from;
    }

    enum CharType {
        SMALL_LETTER,
        CAPITAL_LETTER,
        DIGIT,
        SYMBOL
    }

    public static char getRandomCharacter(CharType charType) {

        switch (charType) {
            case SMALL_LETTER:
                return (char) randomNumber(97, 122); // a-z
            case CAPITAL_LETTER:
                return (char) randomNumber(65, 90);  // A-Z
            case SYMBOL:
                return (char) randomNumber(33, 47);  // symbols
            case DIGIT:
                return (char) randomNumber(48, 57);  // 0-9
            default:
                return '\0';
        }
    }
 public static String generateword(CharType Chartype,int j) {
	 String word ="";
	 for (int i = 1;i<=j;i++) {
		word = word + getRandomCharacter(CharType.CAPITAL_LETTER); 
	 }
return word;	 
 }
 public static String generatekey() {
	String key;
	key = generateword(CharType.CAPITAL_LETTER, 4)+"-";
	key =key+ generateword(CharType.CAPITAL_LETTER, 4)+"-";
	key =key+ generateword(CharType.CAPITAL_LETTER, 4)+"-";
	key =key+ generateword(CharType.CAPITAL_LETTER, 4);

	
	 return key;
 }

 public static void generatekeys(String[] arr) {
	 for (int i =0;i<arr.length;i++) {
		 arr[i]=generatekey();
	 }
 }
 

      public static void main(String[] args) {
    	  int n = Ispositivenum("enter a positive number : ");  
        String []arr = new String [n];
        generatekeys(arr);
        for (String key : arr) {
            System.out.println(key);
        }
        
          }
}
