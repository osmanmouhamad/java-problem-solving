package Problemslvl1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Problem34 {
	public static int Ispositivenum(String s , Scanner scan) {
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
	 public static int[]Readarray(int n){
			int arr[]=new int[n];
			for (int i = 0 ;i<n;i++) {
				arr[i]= randomNumber(1, 100);
			}
			return arr;
		}
	 public static void Printarray(int arr[]) {
		 for (int i =0;i<arr.length;i++) {
			 
		 }
		 System.out.println("The original array is : "+Arrays.toString(arr));
	 }
	 public static void Searcharray(int n,int[]arr) {
		 boolean found =false;
	        for (int i = 0; i < arr.length; i++) {
	        	
	            if (arr[i] == n) {
	                System.out.println("Number you're looking for is: " + n);
	                System.out.println("The number is found at index: " + i);
	                System.out.println("The number is in position : " + (i + 1));
	                found = true;
	                break; // stop searching after finding it
	            }
	        }
	        
	        if (!found) {
	            System.out.println("Number you're looking for is: " + n);
	            System.out.println("The number was not found in the array.");
	        }
	    }
	 public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[]= Readarray(Ispositivenum("enter a number positive ", scan));
		Printarray(arr);
		int n = Ispositivenum("Please enter a number to search for ", scan);
		Searcharray(n, arr);
	}
}

