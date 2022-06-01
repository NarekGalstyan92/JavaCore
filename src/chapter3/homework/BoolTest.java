package chapter3.homework;

public class BoolTest {
    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println("boolean b is " + b);

        b = true;
        System.out.println("b now is " + b);

        b = false;
        if (b) System.out.println("This is not executed");
        System.out.println("10 > 9 is " + (10 > 9));


    }
}
