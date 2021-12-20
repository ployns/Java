import java.util.Random;
import java.util.Scanner;

public class Lab03 {

    public static void main(String[] args) {
        System.out.print("Enter the size for the matrix: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        if (size < 1) {
            System.out.println("ERROR");
        }

        Random rand = new Random();
        int[][] matrix = new int[size][size];

        boolean checkRow = true, row = false;
        boolean checkColumn = true, column = false;
        boolean checkSuperDiagonal = true;
        boolean checkDiagonol = true;
        boolean checkSubDiagonol = true;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = rand.nextInt(2);
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (matrix[i][j] != matrix[i][j + 1]) {
                    checkRow = false;
                }
            }
            if (checkRow == true) {
                System.out.println("All " + matrix[i][0] + "s on row " + i);
                row = true;
            } else {
                checkRow = true;
            }
        }
        if (row == false) {
            System.out.println("No same number on a row");
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (matrix[j][i] != matrix[j + 1][i]) {
                    checkColumn = false;
                }
            }
            if (checkColumn == true) {
                System.out.println("All " + matrix[0][i] + "s on column " + i);
                column = true;
            } else {
                checkColumn = true;
            }
        }
        if (column == false) {
            System.out.println("No same number on a column");
        }

        for (int i = 0; i < size - 2; i++) {
            if (matrix[i][i + 1] != matrix[i + 1][i + 2]) {
                checkSuperDiagonal = false;
            }
        }
        if (checkSuperDiagonal == true) {
            System.out.println("All " + matrix[0][1] + "s on superdiagonol");
        } else {
            System.out.println("No same number on a superdiagonol");
        }

        for (int i = 0; i < size - 1; i++) {
            if (matrix[i][i] != matrix[i + 1][i + 1]) {
                checkDiagonol = false;
            }
        }
        if (checkDiagonol == true) {
            System.out.println("All " + matrix[0][0] + "s on diagonal");
        } else {
            System.out.println("No same number on a diagonal");
        }

        for (int i = 0; i < size - 2; i++) {
            if (matrix[i + 1][i] != matrix[i + 2][i + 1]) {
                checkSubDiagonol = false;
            }
        }
        if (checkSubDiagonol == true) {
            System.out.println("All " + matrix[1][0] + "s on subdiagonol");
        } else {
            System.out.println("No same number on a subdiagonol");
        }
    }
}