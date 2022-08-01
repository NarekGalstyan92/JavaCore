package chapter11.homework.MethodSynchronization;

// This program is not synchronized
class CallMe {
    /* without keyword synchronized the program
    * will run nonsinchronized
    */
    synchronized void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.print("]");
    }
}
