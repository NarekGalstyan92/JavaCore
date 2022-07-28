package chapter14.classwork.sortlist;


import homework.books.model.UserType;

import java.util.Set;
import java.util.TreeSet;

class TreeSetExample {
    public static void main(String[] args) {
        Set<User> userSet = new TreeSet<>(new UserEmailComparator());

        User user1 = new User("Poxos", "Poxosyan", "3Poxosyan@gmail.com", "poxospoxos", UserType.USER);
        User user2 = new User("Aram", "Aramyan", "2Aramyan@gmail.com", "poxospoxos", UserType.USER);
        User user3 = new User("Zaven", "Zavenyan", "1Zavenyan@gmail.com", "poxospoxos", UserType.USER);
        User user4 = new User("Valod", "Valodyan", "4Valodyan@gmail.com", "poxospoxos", UserType.USER);

        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);
        userSet.add(user4);

        for (User user : userSet) {
            System.out.println(user);
        }
    }
}
