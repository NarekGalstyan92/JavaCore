package chapter11.homework.interthreadCommunication.wrongImplementation;

class Consumer implements Runnable{
    Q q;
    Thread t;

    Consumer(Q q) {
        this.q = q;
        t = new Thread(this, "Consumer");
    }

    public void run() {
        int i = 0;

        while (true) {
            q.get();
        }
    }
}
