package chapter8.homework;

// A simple example of inheritance
//Create a superclass
class A {
    int i, j;

    void showij() {
        System.out.println("i and j: " + i + " " + j);
    }
}
// Create a subclass by extending class A
class B extends A {
    int k;
    void showk () {
        System.out.println("k: " + k);
    }
    void sum() {
        System.out.println("i+j+k: " + (i+j+k));
    }
}
