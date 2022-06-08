package chapter7.homework;

public class OverLoadDemo {
    public static void main(String[] args) {
        OverLoad ob = new OverLoad();
        int i = 88;
        //call all versions of test.
        ob.test();
        ob.test(10, 20);

        ob.test(i); //this will invoke test(double)
        ob.test(123.2);  //this will invoke test(double)

    }

}
