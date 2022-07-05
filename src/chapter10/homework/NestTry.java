package chapter10.homework;

// An example of nested try statements.
public class NestTry {
    public static void main(String[] args) {
        try {

            int a = 2; // <-- here is the number which is playing the role
            int b = 42 / a;

            System.out.println("a = " + a);
            try { // Nested try block
                if (a == 1) {
                    a = a / (a - a);
                }
                if (a == 2) {
                    int[] c = {1};
                    c[42] = 99;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out-of-bounds: " + e);
            }
        } catch (ArithmeticException e) {
            System.out.println("Divide by 0: " + e);
        }
    }
}
