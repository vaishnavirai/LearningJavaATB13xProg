package ex_01_java_basics;

import java.util.Scanner;

public class ch11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value for N: ");
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
