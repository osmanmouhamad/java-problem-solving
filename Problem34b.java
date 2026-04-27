package Problemslvl1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Problem34b {
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
	 public static int Searcharray(int n,int[]arr) {
		 
	        for (int i = 0; i < arr.length; i++) {
	        	if(n==arr[i]) {
	        		return i;
	        	}
	        }
	        return -1;
	        }
	 public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[]= Readarray(Ispositivenum("enter a number positive ", scan));
		Printarray(arr);
		int n = Ispositivenum("Please enter a number to search for ", scan);
		int NumberPosition = Searcharray(n, arr);
		if (NumberPosition == -1) {
			System.out.println("The number is not found :-(");
		}
		else 
		{
			System.out.println("The number found at position: " +NumberPosition);
			System.out.println("The number found its order  : " + (NumberPosition + 1));
		}
		
	}
}

