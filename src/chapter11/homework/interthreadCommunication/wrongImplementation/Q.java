package chapter11.homework.interthreadCommunication.wrongImplementation;

// An incorrect implementation of a producer and a consumer
class Q {
    int n;

    synchronized int get() {
        System.out.println("Got " + n);
        return n;
    }

    synchronized void put(int n) {
        this.n = n;
        System.out.println("Put " + n);
    }
}
