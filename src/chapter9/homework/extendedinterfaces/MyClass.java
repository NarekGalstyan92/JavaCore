package chapter9.homework.extendedinterfaces;

// this class must implement all of A and B
class MyClass implements B {
    @Override
    public void meth1() {
        System.out.println("Implement meth1().");
    }

    @Override
    public void meth2() {
        System.out.println("Implement meth2().");
    }

    @Override
    public void meth3() {
        System.out.println("Implement meth3().");
    }
}
