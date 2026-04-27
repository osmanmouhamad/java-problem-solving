package Problemslvl1;

import java.util.Random;
import java.util.Scanner;

public class Problem21 {
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
    public static String generateKey(int n) {
    	String key = "";
    	for (int i = 1;i<=16;i++) {
    		key = key + (char) randomNumber(65, 90);
    		if (i<16) {
    			if (i % 4 ==0) {
    			key = key + "-";
    		}
    		}
    		
    		
    	}
    	
    	return key;
    }
    public static void main(String[] args) {
    	int n = Ispositivenum("enter a number positive : ");
    	for (int i = 1 ; i <=n;i++) {
    		System.out.println("Key ["+i+"]="+generateKey(n)); 
    		}
    	
		
	}
}
