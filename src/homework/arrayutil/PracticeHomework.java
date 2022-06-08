package homework.arrayutil;

public class PracticeHomework {

    long convert(int minutes) {

        return minutes * 60L;
    }

    int calcAge(int years) {
        return years * 365;
    }

    int nextNumber(int nextNumber) {
        return ++nextNumber;
    }

    boolean isSameNum(int a, int b) {
        return a == b;
    }

    boolean lessThanOrEqualToZero(int value) {
        return value <= 0;
    }

    boolean reverseBool(boolean b) {
        return !b;
    }

    int maxLenght(int[] array1, int[] array2) {

        return array1.length > array2.length ? array1.length : array2.length;

    }
}
