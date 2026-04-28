package Problemslvl1;

import java.util.Scanner;

public class DynamicArrayInputManager {
	    public static int ReadNumber(Scanner scan) {
	        System.out.print("\nPlease enter a number? ");
	        int number = scan.nextInt();
	        return number;
	    }

	    
	    public static void AddArrayElement(int number, int[] arr, int[] arrLength) {
	        arr[arrLength[0]] = number;
	        arrLength[0]++;
	    }

	    public static void InputUserNumbersInArray(int[] arr, int[] arrLength, Scanner scan) {
	        boolean addMore = true;

	        do {
	            AddArrayElement(ReadNumber(scan), arr, arrLength);

	            System.out.print("\nDo you want to add more numbers? [0]:No, [1]:Yes? ");
	            int choice = scan.nextInt();
	            addMore = (choice == 1);
	        } while (addMore);
	    }

	    public static void PrintArray(int[] arr, int arrLength) {
	        for (int i = 0; i < arrLength; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int[] arr = new int[100];
	        int[] arrLength = {0}; 

	        InputUserNumbersInArray(arr, arrLength, scan);

	        System.out.println("\nArray Length: " + arrLength[0]);
	        System.out.print("Array elements: ");
	        PrintArray(arr, arrLength[0]);

	        scan.close();
	    }
	}
