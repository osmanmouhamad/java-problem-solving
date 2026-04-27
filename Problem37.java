package Problemslvl1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Problem37 {
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
		    System.out.println("The array is: " + Arrays.toString(arr));
		}
	    public static void AddArrayElement(int number, int[] arr, int[] arrLength) {
	        arr[arrLength[0]] = number;
	        arrLength[0]++;
	    }
	    public static void CopyArrayUsingAddArrayElement(int[] arrSource, int[] arrDestination, int arrLength, int[] arrDestinationLength) {
	        for (int i = 0; i < arrLength; i++) {
	            AddArrayElement(arrSource[i], arrDestination, arrDestinationLength);
	        }
	    }

	 public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
			int arr[]= Readarray(Ispositivenum("Enter a number postive : ", scan));
			 int[] arr2 = new int[100]; 
		        int[] arr2Length = {0}; 

		        CopyArrayUsingAddArrayElement(arr, arr2, arr.length, arr2Length);
			
			Printarray(arr);
			Printarray(Arrays.copyOf(arr2, arr2Length[0]));
			
	}
}
