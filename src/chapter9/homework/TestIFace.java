package chapter9.homework;

public class TestIFace {
    public static void main(String[] args) {
        CallBack c = new Client();
        c.callBack(42);
    }
}
