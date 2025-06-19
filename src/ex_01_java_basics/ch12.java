package ex_01_java_basics;

import java.util.Scanner;

public class ch12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1;
            int i = number;

            while (i > 1) {
                factorial *= i;
                i--;
            }

            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        scanner.close();
    }

}

