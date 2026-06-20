package Problemslvl2;

import java.util.Random;

public class MatrixMinMax {

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
    public static int findMinNumber(int[][]arr) {
    	int min = arr[0][0];
    	for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
            if(arr[i][j]< min)
            	min = arr[i][j];
            	
            }
            }
    	return min ;
    }
    public static int findMaxNumber(int[][]arr) {
    	int max = arr[0][0];
    	for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
            if(arr[i][j]> max)
            	max = arr[i][j];
            	
            }
            }
    	return max ;
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
       System.out.println("the min number in the matrix is "+ findMinNumber(matrix));
       System.out.println("the max number in the matrix is "+ findMaxNumber(matrix));

}
}