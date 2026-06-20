package Problemslvl2;
public class IdentityMatrixChecker {
    public static void printMatrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean isIdentityMatrix (int[][]arr) {
    	for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
               if(i==j&&arr[i][j]!=1) {
            	   return false;
            } else if(i!=j&&arr[i][j]!=0) {
            	return false;
            }
               
           
        }
    }
    	return true;
	}
    public static void main(String[] args) {
    	int[][] Matrix1 = { {1,0,0},{0,1,0},{0,0,1} };
    	printMatrix(Matrix1);
    	if(isIdentityMatrix(Matrix1)) {
    		System.out.println("YES , Matrix is identity.");
    	}else
    	{
    		System.out.println("No , Matrix is NOT identity.");
    	}
        
    }
}