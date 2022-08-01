package chapter11.homework.synchronizedStatement;

class Caller implements Runnable {
    String msg;
    CallMe target;
    Thread t;

    public Caller(CallMe targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
    }

    public void run() {
        synchronized (target) { //Synchronized block
            target.call(msg);
        }
    }
}
