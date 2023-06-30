import java.util.Arrays;
import java.util.Scanner;

import java.util.Scanner;

public class SquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете размер на матрицата: ");
        int size = scanner.nextInt();

        int[][] matrix = new int[size][size];

        // Попълване на матрицата
        int num = 1;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                matrix[col][row] = num++;
            }
        }

        // Извеждане на матрицата
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.printf("%2d ", matrix[row][col]);
            }
            System.out.println();
        }
    }
}

