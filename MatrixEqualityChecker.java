package Problemslvl2;

import java.util.Random;

public class MatrixEqualityChecker {

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
 
		public static boolean AreTypcalMatrices (int[][] a,int[][] b) {
			 for (int i = 0; i < 3; i++) {
		            for (int j = 0; j < 3; j++) 
		           if(a[i][j]!=b[i][j]) 
		        	   return false;
		           
		            	 
		             
		            
		            }
		            return true;
		            
		            
		}
	

    public static void main(String[] args) {
        int[][] matrix1 = generateRandomMatrix();
        int[][] matrix2 = generateRandomMatrix();

        System.out.println("Matrix1 ");
        printMatrix(matrix1);
        System.out.println();
        System.out.println("Matrix2 ");
        printMatrix(matrix2);
        System.out.println();
        if (AreTypcalMatrices(matrix1,matrix2)) {
        	System.out.println("yes, matrices are equals");
        }
        else
        	System.out.println("No, matrices are not equals");

    }
}