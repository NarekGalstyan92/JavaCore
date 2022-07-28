package chapter14.classwork.sortlist;

import java.util.Comparator;

class UserEmailComparator implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        return o1.getEmail().compareTo(o2.getEmail());
    }
}
