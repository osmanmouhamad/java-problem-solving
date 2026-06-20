package Problemslvl2;

public class ScalarMatrixChecker {

//    static Random rand = new Random();
//
//    public static int randomNumber(int from, int to) {
//        return rand.nextInt(to - from + 1) + from;
//    }

//    public static int[][] generateRandomMatrix() {
//        int[][] a = new int[3][3];
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                a[i][j] = randomNumber(1, 100);
//            }
//        }
//        return a;
//    }

    public static void printMatrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean isScalarMarix (int[][]arr) {
    	int diagonalValue = arr[0][0];
    	for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
               if(i==j&&arr[i][j]!= diagonalValue ) {
            	   return false;
            } else if(i!=j&&arr[i][j]!=0) {
            	return false;
            }
               
           
        }
    }
    	return true;
	}
    public static void main(String[] args) {
    	int[][] Matrix1 = { {3,0,0},{0,3,0},{0,0,3} };
    	printMatrix(Matrix1);
    	if(isScalarMarix(Matrix1)) {
    		System.out.println("YES , Matrix is Scalar.");
    	}else
    	{
    		System.out.println("No , Matrix is NOT Scalar.");
    	}
        
    }
}