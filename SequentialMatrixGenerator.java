package Problemslvl2;

import java.util.Random;

public class SequentialMatrixGenerator {

    
	public static int[][] generateMatrix() {

	    int[][] a = new int[3][3];
	    int m = 1;

	    for (int i = 0; i < a.length; i++) {
	        for (int j = 0; j < a[i].length; j++) {
	            a[i][j] = m;
	            m++;
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

    public static void main(String[] args) {
        int[][] matrix = generateMatrix();
        printMatrix(matrix);
    }
}