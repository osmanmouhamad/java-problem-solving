package Problemslvl2;

import java.util.Random;
import java.util.Scanner;

public class MatrixNumberCounter {

    static Random rand = new Random();

    public static int randomNumber(int from, int to) {
        return rand.nextInt(to - from + 1) + from;
    }

    public static int[][] generateRandomMatrix() {
        int[][] a = new int[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = randomNumber(1, 100);
            }
        }
        return a;
    }
    public static int countNumberInMatrix(int[][]arr,int a) {
    	int count = 0 ;
    	for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
            if(arr[i][j] == a)
            	count ++;
            }
            }
    	return count ;
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
    	Scanner scan = new Scanner(System.in);
        int[][] matrix = generateRandomMatrix();
        printMatrix(matrix);
        System.out.println("Enter the number to count in matrix?");
        int a = scan.nextInt();
        System.out.println("count in matrix is " + countNumberInMatrix(matrix, a) );
        scan.close();
    }
}