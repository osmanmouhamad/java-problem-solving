package Problemslvl1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Problem31 {
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
		arr[i]= i+1;
	}
	return arr;
}
public static void Shufflearray(int[] arr) {
	for(int i = 0 ;i<arr.length;i++) {
		int index1=randomNumber(1, arr.length)-1;
		int index2 = randomNumber(1,arr.length)-1;
		int Temp = arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=Temp;
	}
}
public static void Printarray(int arr[]) {
	 System.out.println(Arrays.toString(arr));
}
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int length = Ispositivenum("Enter a number positive",scan);
	int []arr= Generatearray(length);
	System.out.print("the original array is : ");
	Printarray(arr);
	Shufflearray(arr);
    System.out.print("the new array is : ");
    Printarray(arr);
}











}
