package Problemslvl1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SumOfTwoArrays {
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
	 public static int[]Generatearray(int n){
			int arr[]=new int[n];
			for (int i = 0 ;i<n;i++) {
				arr[i]= randomNumber(1, 100);
			}
			return arr;
		}
	 public static void Printarray(int arr[]) {
		 for (int i =0;i<arr.length;i++) {
			 
		 }
		 System.out.println("The Second array is : "+Arrays.toString(arr));
	 }
	 
	 public static void Sumarrays(int arr1[],int[]arr2) {
		 int arr3[]=new int[arr1.length];
		 for(int i = 0 ;i<arr1.length;i++) {
			arr3[i]=arr1[i]+arr2[i];
		 }
		 System.out.println("The Sum of first arr and Secind arr is : "+Arrays.toString(arr3));
	 }
	 public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Ispositivenum("Enter a number postive : ", scan);
		int arr1[]= Generatearray(n);
		int arr2[]= Generatearray(n);
        Printarray(arr1);
        Printarray(arr2);	
        Sumarrays(arr1, arr2);
		
	}
}

