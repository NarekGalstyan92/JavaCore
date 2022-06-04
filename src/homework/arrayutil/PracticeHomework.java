package homework.arrayutil;

public class PracticeHomework {
    int second;
    int minute;
    int something;
    int anything = something++;

    int letterC;
    int letterD;
    boolean h = true;

    long convert(int minutes) {
        second = minutes;
        minute = second * 60;
        return minute;
    }

    int nextNumber(int nextNumber) {

        something = nextNumber++;


        return nextNumber;
    }

    boolean isSameNum(int a, int b) {
        something = a;
        anything = b;
        boolean same = false;
        if (a == b) {
            same = true;
        }

        return same;
    }

    boolean lessThanOrEqualToZero(int number) {
        something = number;
        boolean checkEqual = false;
        if (number <= 0) {
            checkEqual = true;
        } else {
            checkEqual = false;
        }
        return checkEqual;
    }

    boolean reverseBool(int s, int a) {
        something = s;
        anything = a;
        boolean deny;
        if (s + a == 20) {
            deny = true;
        } else if (s + a != 20) {
            deny = false;
        }
        return false;
    }

    void maxLenght(int c, int d) {

        letterC = c;
        letterD = d;

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < array1.length; i++) {
            c = i;

        }
        for (int i = 0; i < array2.length; i++) {
            d = i;
        }
        if (c > d) {

            System.out.print("The longest array length is: " + c);
        } else {
            System.out.print("The longest array length is: " + d);
        }

    }


}
