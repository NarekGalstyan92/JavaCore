package chapter9.homework.fundamentalmethods;

// Use the default method
class DefaultMethodDemo {
    public static void main(String[] args) {

        MyIFIpl obj = new MyIFIpl();
        // Can call getNumber(), because it is explicitly
        // implemented by MyIFIpl:
        System.out.println(obj.getNumber());

        // Can also call getString(), because of default implementation:
        System.out.println(obj.getString());
    }
}
