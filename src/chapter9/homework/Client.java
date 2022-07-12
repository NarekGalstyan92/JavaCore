package chapter9.homework;
 class Client implements CallBack{
    // Implement CallBack's interface

    @Override
    public void callBack(int p) {
        System.out.println("callback called with " + p);
    }

    void nonIfaceMeth() {
        System.out.println("Classes that implement interfaces " + "may also define other members, too.");
    }
}
