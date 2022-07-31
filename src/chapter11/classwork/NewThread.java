package chapter11.classwork;

public class NewThread implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("дочерний поток" + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("дочерний поток завершен");

    }
}
