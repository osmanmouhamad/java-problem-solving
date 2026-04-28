package Problemslvl1;

import java.util.Random;

public class RandomNumberGenerator {
	 public static int randomNumber(int from, int to) {
	        Random rand = new Random();
	        return rand.nextInt(to - from + 1) + from;
	    }
	 public static void main(String[] args) {
		System.out.println(randomNumber(1, 10));
		System.out.println(randomNumber(1, 10));
		System.out.println(randomNumber(1, 10));
	}
}
