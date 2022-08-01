package chapter11.homework.multiThreadExample;

// Create multiple threads
class NewThread implements Runnable {
    String name; // name ot thread
    Thread t;

    NewThread(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
//        t.start(); // this line exist in english version of the book, but not in russian version. and it throws IllegalArgumentException.
    }

    // This is entry point for thread
    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " Interrupted");
        }
        System.out.println(name + " exiting");
    }
}
