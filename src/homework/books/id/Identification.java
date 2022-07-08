package homework.books.id;

import java.util.Scanner;

public class Identification {
    private static final String userName = "admin";
    private static final String passWord = "123456";

    public static void welcomePart() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username");
        String username = scanner.nextLine().trim().toLowerCase();
        System.out.println("Enter password");
        String password = scanner.nextLine();

        if (username == null || password == null) {
            System.out.println("PLease fill the fields");
            welcomePart();
        } else if (!userName.equals(username) | !passWord.equals(password)) {
            System.out.println("username or password are incorrect");
            welcomePart();
        } else if (userName.equals(username) && passWord.equals(password)) {
            System.out.println("Welcome to " + "\"" + "Bookinist" + "\"" + " storage" + '\n');
        }
    }
}

