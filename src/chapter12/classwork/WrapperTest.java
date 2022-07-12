package chapter12.classwork;

public class WrapperTest {
    public static void main(String[] args) {
        Integer a = new Integer(7); // or instead of "new Integer" we can write Integer.ValueOf(7)
        int i = a;
        System.out.println(i);

        int b = 543;
        Integer bOb = b;

    }
}
