package chapter14.classwork.sortlist;

import homework.books.model.UserType;

import java.util.ArrayList;
import java.util.List;

class SortListExample {
    public static void main(String[] args) {

        List<User> userList = new ArrayList<>();
        User user1 = new User("Poxos", "Poxosyan", "3Poxosyan@gmail.com", "poxospoxos", UserType.USER);
        User user2 = new User("Aram", "Poxosyan", "2Aramyan@mail.com", "poxospoxos", UserType.USER);
        User user3 = new User("Zaven", "Poxosyan", "1Zavenyan@gmail.com", "poxospoxos", UserType.USER);
        User user4 = new User("Valod", "Poxosyan", "4Valodyan@gmail.com", "poxospoxos", UserType.USER);

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

        System.out.println("Before sort");
        for (User user : userList) {
            System.out.println(user);
        }
        userList.sort(new UserEmailComparator());
        System.out.println("After sort");
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
