package Problemslvl1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PrimeNumbersArrayExtractor {
	public static int Ispositivenum(String s , Scanner scan) {
		int a ;
		do {
			System.out.println(s);
			a= scan.nextInt();
		}while(a<=0);
		return a;
	}
	public static boolean Checkprime(int a) {
		int sum = 0;
		for(int i = 1;i<=a;i++) {
			if(a % i==0) {
				sum+=1;
			}
		}
		return (sum==2);
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
	 public static int[] Primenumber(int arr[] ) {
		 int counter=0;
		for(int i =0 ;i<arr.length;i++) {
			if(Checkprime(arr[i])) {
				counter++;
			}
		}
		int arr2[]=new int[counter];
		int index = 0;
		for(int i =0;i<arr.length;i++) {
			if(Checkprime(arr[i])) {
				arr2[index]=arr[i];
				index++;
			}
		}
		return arr2;
	 }
	 public static void Printarray(int arr[]) {
		 System.out.println("The original array is : "+Arrays.toString(arr));
	 }
	 public static void CopyPrimearray(int arr[]) {
		System.out.println("The copy Prime arr is "+ Arrays.toString(arr));
	}
	 public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
			int arr[]= Readarray(Ispositivenum("Enter a number postive : ", scan));
			Printarray(arr);
			int arr2[]=Primenumber(arr);
			if(arr2.length == 0) {
			    System.out.println("No prime numbers found.");
			} else {
			    CopyPrimearray(arr2);
			}

	}
}
