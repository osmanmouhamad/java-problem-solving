package Problemslvl2;

import java.util.Random;

public class PalindromeMatrix {

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

    public static void printMatrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean isPalindrome(int[][]matrix) {
    	for(int i = 0 ;i<matrix.length;i++) {
    		for (int j = 0 ; j <matrix[i].length/2;j++) {
    			if(matrix[i][j]!=matrix[i][matrix[i].length-1-j]) {
    				return false;
    			}
    		}
    	}
    	return true;
    }
    public static void main(String[] args) {
        int[][] matrix = {{2,0,3},{1,0,1},{2,0,2}};
        printMatrix(matrix);
        if(isPalindrome(matrix))
        	System.out.println("Yes, is Palindrome");
        else 
        	System.out.println("No , isn't Palindrome");

}
}