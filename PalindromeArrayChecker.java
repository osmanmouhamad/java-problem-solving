package Problemslvl1;

import java.util.Arrays;

public class PalindromeArrayChecker {
	 public static	void FillArray(int arr[])
		{
		    arr[0] = 10;
		    arr[1] = 20;
		    arr[2] = 30;
		    arr[3] = 30;
		    arr[4] = 20;
		    arr[5] = 10;
		    
		}
	 public static void Printarray(int arr[]) {
		 for (int i =0;i<arr.length;i++) {
			 
		 }
		 System.out.println("The original array is : "+Arrays.toString(arr));
	 }
	 public static boolean Ispalindormearray(int []arr) {
		 for (int i = 0 ;i<arr.length;i++) {
			 if(arr[i]!=arr[arr.length-i-1]) {
				 return false;
			 }
			 
		 }
		 return true;
		 }
	 public static void main(String[] args) {
		int []arr = new int[6];
		FillArray(arr);
		Printarray(arr);
		if(Ispalindormearray(arr)) {
			System.out.println("Yes array is Palindrome ");
		}
		else 
		{
			System.out.println("NO array is NOT Palindrome");
		}
	}
	 }

