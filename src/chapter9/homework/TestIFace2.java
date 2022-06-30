package chapter9.homework;

public class TestIFace2 {
    public static void main(String[] args) {
        CallBack c = new Client();
        AnotherClient ob = new AnotherClient();

        c.callBack(42);
        c = ob; // c now refers to AnotherClient object
        c.callBack(42);
    }
}
