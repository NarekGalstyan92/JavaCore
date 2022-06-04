package homework.arrayutil;

public class ArrayUtil {
    int[] array = {2, 4, 6, 1, 9, 6};

    int max() {

        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    int min() {
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array.length) {
                min = array[i];
            }
        }
        return min;
    }

    void even() {
        int even = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 & array[i] != 0) {
                even = array[i];
                System.out.print(even + " ");
            }
        }
    }

    void odd() {

        int odd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1 & array[i] != 0) {
                odd = array[i];
                System.out.print(odd + " ");
            }
        }
    }

    int counteven() {
        int evencount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 & array[i] != 0) {
                evencount++;
            }
        }
        return evencount;
    }

    int countodd() {
        int oddcount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1 & array[i] != 0) {
                oddcount++;
            }
        }
        return oddcount;
    }

    double aritmAverage() {
        double aritmaver = 0;
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            aritmaver = sum / array.length;

        }
        return aritmaver;
    }

    int elementsummary() {
        int summary = 0;
        for (int i = 0; i < array.length; i++) {
            summary = summary + array[i];
        }
        return summary;
    }
}




