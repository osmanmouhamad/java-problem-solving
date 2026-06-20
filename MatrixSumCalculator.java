package Problemslvl2;

import java.util.Random;

public class MatrixSumCalculator {

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

    public static void printMatrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int sumOfMatrix(int[][]arr) {
    	int sum=0;
    	 for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr[i].length; j++) {
                 sum+=arr[i][j];
             }
             
         }
    	 return sum;
     }
		
	

    public static void main(String[] args) {
        int[][] matrix = generateRandomMatrix();
        System.out.println("Matrix1 ");
        printMatrix(matrix);
        System.out.println("Sum of Matrix1 : " + sumOfMatrix(matrix));
        
    }
}