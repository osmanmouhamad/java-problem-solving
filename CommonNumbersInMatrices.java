package Problemslvl2;

import java.util.Random;
public class CommonNumbersInMatrices {

    static Random rand = new Random();

    public static int randomNumber(int from, int to) {
        return rand.nextInt(to - from + 1) + from;
    }

    public static int[][] generateRandomMatrix() {
        int[][] a = new int[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = randomNumber(0, 10);
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
    public static int [] intersectedNumbers(int[][]m1 ,int [][]m2 ) {
    	int count = 0 ;
    	
    	for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++)
            {
            	if(isNumberInMatrix(m2, m1[i][j])) {
            		count++;
            	}
            }
            }
    	int [] arr = new int [count];
    	int index = 0;
    	for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++)
            {
            	if(isNumberInMatrix(m2, m1[i][j])) {
            		arr[index]=m1[i][j];
            		index++;
            	}
            }
            }
    	return arr;
    }

    public static void printMatrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void printArray(int[] arr) {
        if (arr.length == 0) {
            System.out.println("The array is empty");
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[][] matrix1 = generateRandomMatrix();
        int[][] matrix2 = generateRandomMatrix();
        System.out.println("Matrix1 ");
        printMatrix(matrix1);
        System.out.println();
        System.out.println("Matrix2");
        printMatrix(matrix2);
        System.out.println();
        System.out.println("The intersected number is : ");
        printArray(intersectedNumbers(matrix1, matrix2));
       
}
}