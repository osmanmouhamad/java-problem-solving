package Problemslvl2;

import java.util.Random;

public class MatrixColumnsSumArray {

    static Random rand = new Random();

    public static int randomNumber(int from, int to) {
        return rand.nextInt(to - from + 1) + from;
    }

    public static void fillMatrixWithRandomNumbers(int[][] arr, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = randomNumber(1, 100);
            }
        }
    }

    public static void printMatrix(int[][] arr, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%3d ", arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void sumMatrixCols(int[][] arr, int rows, int cols) {

        int[] a = new int[cols];

        for (int i = 0; i < cols; i++) {

            int sum = 0;

            for (int j = 0; j < rows; j++) {
                sum += arr[j][i];
            }

            a[i] = sum;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println("Sum of col " + (i + 1) + " = " + a[i]);
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];

        fillMatrixWithRandomNumbers(matrix, 3, 3);
        printMatrix(matrix, 3, 3);
        sumMatrixCols(matrix, 3, 3);
    }
}