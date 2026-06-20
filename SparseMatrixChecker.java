package Problemslvl2;

import java.util.Random;

public class SparseMatrixChecker {

    static Random rand = new Random();

    public static int randomNumber(int from, int to) {
        return rand.nextInt(to - from + 1) + from;
    }

    public static int[][] generateRandomMatrix() {
        int[][] a = new int[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = randomNumber(0, 1);
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
     public static boolean isSparseMatrix (int [][]arr) {
    	 int matrixSize = arr.length*arr[0].length;
    	 return countNumberInMatrix(arr, 0) > matrixSize/2;
     }
    public static void main(String[] args) {
        int[][] matrix = generateRandomMatrix();
        printMatrix(matrix);
        if(isSparseMatrix(matrix))
        	System.out.println("yes the matrix is sparse ");
        else
        	System.out.println("no the matrix isn't sparse");
    }
}