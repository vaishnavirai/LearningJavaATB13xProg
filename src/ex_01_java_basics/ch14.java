package ex_01_java_basics;

import java.util.Scanner;

public class ch14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for patterns: ");
        int rows = scanner.nextInt();


        System.out.println("\nRight Triangle Pattern:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\nPyramid Pattern:");
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int space = 1; space <= rows - i; space++) {
                System.out.print("  ");
            }
            // Print stars
            for (int star = 1; star <= 2 * i - 1; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
