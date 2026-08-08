import java.util.Scanner;

public class PyramidPattern {

    public static void printPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {

            // Print spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        if (rows <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            printPyramid(rows);
        }

        scanner.close();
    }
}