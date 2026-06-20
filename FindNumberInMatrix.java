package Problemslvl2;

import java.util.Random;
import java.util.Scanner;

public class FindNumberInMatrix {

    static Random rand = new Random();

    public static int randomNumber(int from, int to) {
        return rand.nextInt(to - from + 1) + from;
    }

    public static int[][] generateRandomMatrix() {
        int[][] a = new int[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = randomNumber(0, 100);
            }
        }
        return a;
    }
    public static boolean isNumberInMatrix(int[][]arr,int a) {
    	
    	for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
            if(arr[i][j] == a)
            	return true;
            }
            }
    	return false ;
    }

    public static void printMatrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix = generateRandomMatrix();
        printMatrix(matrix);
       Scanner scan = new Scanner(System.in);
       System.out.println("Please enter the number to look for in the matrix ");
       int a = scan.nextInt();
       if(isNumberInMatrix(matrix, a))
    	   System.out.println("Yes, the number is in the matrix");
       else 
    	   System.out.println("No, the number isn't in the matrix");
       scan.close();
}
}