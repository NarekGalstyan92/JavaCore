package chapter11.classwork;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread t = new Thread(new NewThread(), "our new threat");
        t.start();

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("главный поток" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("главный поток завершен");

    }
}
