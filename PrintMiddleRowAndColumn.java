package Problemslvl2;

import java.util.Random;

public class PrintMiddleRowAndColumn {

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
    public static void PrintMiddleRaw(int[][] a) {
    	for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
            	if(i==1) {
            		
                System.out.print(a[i][j] + " ");
            }
            	 
            }
           
    }
    	System.out.println();
	}
    public static void PrintMiddleCol(int[][] a) {
    	for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
            	if(j==1) {
            		
                System.out.print(a[i][j] + " ");
            }
            	 
            }
            
    }
	}
    public static void main(String[] args) {
        int[][] matrix = generateRandomMatrix();
        System.out.println("Matrix1 ");
        printMatrix(matrix);
        System.out.println("the middle raw of matrix ");
        PrintMiddleRaw(matrix);
        System.out.println("the middle col of matrix ");
        PrintMiddleCol(matrix);
        
    }
}