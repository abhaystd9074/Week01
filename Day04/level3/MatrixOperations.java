import java.util.Random;

public class MatrixOperations {

    public static int[][] addMatrices(int[][] a, int[][] b) {
        int r = a.length;
        int c = a[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = a[i][j] + b[i][j];
            }
        }
        return res;
    }

    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int r = a.length;
        int c = a[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = a[i][j] - b[i][j];
            }
        }
        return res;
    }

    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int r = a.length;
        int c = b[0].length;
        int l = a[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                for (int k = 0; k < l; k++) {
                    res[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return res;
    }

    public static void displayMatrix(int[][] m) {
        for (int[] row : m) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};

        System.out.println("Matrix A:");
        displayMatrix(a);

        System.out.println("Matrix B:");
        displayMatrix(b);

        System.out.println("Addition:");
        displayMatrix(addMatrices(a, b));

        System.out.println("Subtraction:");
        displayMatrix(subtractMatrices(a, b));

        System.out.println("Multiplication:");
        displayMatrix(multiplyMatrices(a, b));

        
    }
}
