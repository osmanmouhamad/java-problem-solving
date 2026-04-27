package Problemslvl2;

import java.util.Random;

public class Problem2 {

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

    public static void sumMatrixRows(int[][] arr, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum += arr[i][j];
            }
            System.out.println("Row " + (i + 1) + " sum = " + sum);
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];

        fillMatrixWithRandomNumbers(matrix, 3, 3);
        printMatrix(matrix, 3, 3);
        sumMatrixRows(matrix, 3, 3);
    }
}