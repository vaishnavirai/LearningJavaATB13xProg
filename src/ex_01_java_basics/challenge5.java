package ex_01_java_basics;

public class challenge5 {
    public static void main(String[] args) {

        int a = 10, b = 5, c = 2;

        System.out.println("Operator Precedence Demo:");
        int result1 = a + b * c;
        System.out.println("a + b * c = " + result1);

        int result2 = (a + b) * c;
        System.out.println("(a + b) * c = " + result2);

        int result3 = a + b - c * 3 / 2;
        System.out.println("a + b - c * 3 / 2 = " + result3);

        System.out.println("\nType Casting Demo:");


        int i = 100;
        double db = i;
        System.out.println("Implicit casting (int to double): " + db);


        double x = 123.456;
        int y = (int) x;
        System.out.println("Explicit casting (double to int): " + y);


        char ch = 'A';
        int ascii = ch;
        System.out.println("Implicit casting (char to int): " + ascii);

        int num = 66;
        char character = (char) num;
        System.out.println("Explicit casting (int to char): " + character);
    }
}
