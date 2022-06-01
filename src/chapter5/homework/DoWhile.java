package chapter5.homework;


// Demonstrate the do-while loop.
public class DoWhile {
    public static void main(String[] args) {
        int n =10;

        do {
            System.out.println("tick " + n);
            n--;
        } while (n >0);

        System.out.println();

        // here is more efficiently option
        do {
            System.out.println("tick " + n);
        }while (--n > 0);
    }
}
