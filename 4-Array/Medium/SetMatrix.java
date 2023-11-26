import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrix {
    public static void main(String[] args) {
        
        SetMatrixZeroes setMatrixZeroes = new SetMatrixZeroes();

        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        setMatrixZeroes.setZeroes(matrix);

        System.out.println("\nMatrix after setting zeroes:");
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    } 

    public static void setZeroes(int) {
        disconnect bc
    } 
    
}
