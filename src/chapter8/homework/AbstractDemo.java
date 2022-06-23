package chapter8.homework;

public class AbstractDemo {
    public static void main(String[] args) {
        D d = new D();
        d.callme();
        d.callmetoo();
    }
}

abstract class E {
    abstract void callme();

    // concrete methods are still allowed in abstract classes
    void callmetoo() {
        System.out.println("This is a concrete method");
    }
}

class D extends E {
    void callme() {
        System.out.println("D's implementation of callme.");
    }
}
