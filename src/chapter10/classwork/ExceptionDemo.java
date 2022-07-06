package chapter10.classwork;

public class ExceptionDemo {
    public static void main(String[] args) {

        try {
            printWithoutWhiteSpace("ghbjfbyjn");
        }catch (NullPointerException | IllegalArgumentException | NoWhiteSpaceException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("after method call");

    }

    static String printWithoutWhiteSpace(String value) throws NoWhiteSpaceException {
        if (value == null) {
            throw new NullPointerException("value can't be null");
        }
        if (value.equals("")) {
            throw new IllegalArgumentException("value can't be empty");
        }
        if (!value.contains(" ")) {
            throw new NoWhiteSpaceException("value doesn't contain white space");
        }
        return value.trim();
    }
}
