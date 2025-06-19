package ex_01_java_basics;

public class challenge3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Comparison Operators
        System.out.println((a == b));
        System.out.println( (a != b));
        System.out.println( (a < b));
        System.out.println((a > b));
        System.out.println( (a <= b));
        System.out.println( (a >= b));

        // Logical Operators
        boolean x = true;
        boolean y = false;


        System.out.println((x && y));
        System.out.println((x || y));
        System.out.println(!x);
        System.out.println(!y);


        System.out.println(((a < b) && (x == true)));
        System.out.println( ((a > b) || (y == false)));
    }
}
