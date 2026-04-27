package Problemslvl1;

import java.util.Arrays;
import java.util.Scanner;

public class Problem40 {
	public static int Ispositivenum(String s , Scanner scan) {
		int a ;
		do {
			System.out.print(s);
			a= scan.nextInt();
		}while(a<=0);
		return a;
	}
  public static	void FillArray(int arr[])
	{
	    arr[0] = 10;
	    arr[1] = 10;
	    arr[2] = 10;
	    arr[3] = 50;
	    arr[4] = 50;
	    arr[5] = 70;
	    arr[6] = 70;
	    arr[7] = 70;
	    arr[8] = 70;
	    arr[9] = 90;
	}
	 public static void Printarray(int arr[]) {
		 for (int i =0;i<arr.length;i++) {
			 
		 }
		 System.out.println("The original array is : "+Arrays.toString(arr));
	 }
	 public static int Searcharray(int n,int[]arr) {
		 
	        for (int i = 0; i < arr.length; i++) {
	        	if(n==arr[i]) {
	        		return arr[i];
	        	}
	        }
	        return -1;
	        }
	 public static boolean Isnumberinarray(int n,int[]arr) {
		 return Searcharray(n, arr)!=-1;
	 }
	 public static void AddArrayElement(int number, int[] arr, int[] arrLength) {
	        arr[arrLength[0]] = number;
	        arrLength[0]++;
	    }  public static void CopyDistinctnumber(int[] arrSource, int[] arrDestination, int arrLength, int[] arrDestinationLength) {
	        for (int i = 0; i < arrLength; i++) {
if(!Isnumberinarray(arrSource[i], arrDestination))	        	 
	        		AddArrayElement(arrSource[i], arrDestination, arrDestinationLength);
	        	
	            
	        }
	    }
	 public static void main(String[] args) {
		 int[]arr=new int[10];
		 FillArray(arr);
		 int[] arr2 = new int[100]; 
	        int[] arr2Length = {0}; 
	        CopyDistinctnumber(arr, arr2, 10, arr2Length);
Printarray(arr);
Printarray(Arrays.copyOf(arr2, arr2Length[0]));
}
	 }

