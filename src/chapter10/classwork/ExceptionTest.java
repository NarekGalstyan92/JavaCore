package chapter10.classwork;

import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args){
        String number = "654t";   //   <-- look at String, there is a 't' in text
        try {
            int a =Integer.parseInt(number);
            System.out.println(a *2);
        } catch (NumberFormatException e) {
            System.out.println("Please input only numbers");
        }

        System.out.println("Hello");
        System.out.println("Java");

        String email = "poxos@mail.com";
        try {
            checkEmail(email);
            System.out.println("email is correct");
        } catch (IOException e) {
            System.out.println("Wrong email");
        }
        System.out.println("End of program");
    }

    static  void checkEmail (String email) throws IOException {
        if (!email.contains("@")) {
            throw new IOException();
        }
        System.out.println("Sending e-mail...");
    }
}
