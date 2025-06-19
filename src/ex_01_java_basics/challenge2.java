package ex_01_java_basics;

public class challenge2 {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        // Arithmetic Operators
        int sum = a + b;
        int diff = a - b;
        int prod = a * b;
        int quot = a / b;
        int mod = a % b;

        System.out.println( sum);
        System.out.println(diff);
        System.out.println( prod);
        System.out.println( quot);
        System.out.println( mod);

        // Assignment Operators
        int x = 10;

        x += 5;
        System.out.println(x);

        x -= 3;
        System.out.println( x);

        x *= 2;
        System.out.println( x);

        x /= 4;
        System.out.println( x);

        x %= 3;
        System.out.println( x);
    }
}
