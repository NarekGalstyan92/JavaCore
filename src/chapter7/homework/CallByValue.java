package chapter7.homework;

public class CallByValue {
    public static void main(String[] args) {
        Test ob = new Test (15, 20);
        int a = 15, b = 20;
        System.out.println("a and b before call: " + a + " " + b);
        ob.meth(a,b);
        System.out.println("a and b before call: " + a + " " + b);
    }
}
