package Problemslvl1;

import java.util.Arrays;
import java.util.Scanner;

public class Problem22 {
	public static int Ispositivenum(String s , Scanner scan) {
		int a ;
		do {
			System.out.println(s);
			a= scan.nextInt();
		}while(a<=0);
		return a;
	}
public static int[]Readarray(int n,Scanner scan){
	int arr[]=new int[n];
	for (int i = 0 ;i<n;i++) {
		System.out.print("Element["+(i+1)+"] : ");
		arr[i]=scan.nextInt();
	}
	return arr;
}
public static void Checkarr(int arr[], Scanner scan) {
    System.out.print("Enter the number you want to check: ");
    int n = scan.nextInt();
    int counter = 0;
    
    for (int i = 0;i< arr.length;i++) {
        if (arr[i] == n) {
            counter++;
        }
    }

    System.out.println("The original array is: " + Arrays.toString(arr));
    System.out.println(n + " is repeated " + counter + " time(s).");
}

public static void main(String[] args) {
	   Scanner scan = new Scanner(System.in);
       int size = Ispositivenum("Enter a positive number: ", scan);
       int[] arr = Readarray(size, scan);
       Checkarr(arr, scan);
}
}
