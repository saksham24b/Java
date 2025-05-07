package assignments;
import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            int [][] matrix1 = new int[2][3];
            System.out.println("Enter matrix 1: ");
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[i].length; j++) {
                    System.out.printf("Enter element at index %d %d: ", i, j);
                    matrix1[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter matrix 2: ");
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[i].length; j++) {
                    System.out.printf("Enter element at index %d %d: ", i, j);
                    int value = sc.nextInt();
                    matrix1[i][j] += value;
                }
            }
            System.out.println("Matrix 1 + Matrix 2:");
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[i].length; j++) {
                    System.out.printf(matrix1[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}