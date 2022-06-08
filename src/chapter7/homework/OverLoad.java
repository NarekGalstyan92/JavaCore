package chapter7.homework;

// Demonstrate method overloading.
public class OverLoad {
    void test() {
        System.out.println("No parameters");
    }

    //Overload test for one integer parameter.
    void test(int a) {
        System.out.println("Inside test(double) a: " + a);
    }

    //Overload test for two integer parameters.
    void test(int a, int b) {
        System.out.println("a and b :" + a + " " + b);
    }

    //overload test for a double parameter.
    void test(double a) {
        System.out.println("Inside test(double) a: " + a);
    }
}
