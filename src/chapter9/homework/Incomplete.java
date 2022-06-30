package chapter9.homework;

abstract class Incomplete implements CallBack{
    int a, b;

    void show() {
        System.out.println(a + " " + b);
    }
    //...
}
