package homework.arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {

        //տպել մասսիվի բոլոր էլեմենտները
        System.out.print("Here are all numbers of this array: ");
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 5;
        }
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.println('\n');


        //տպել մասսիվի ամենամեծ էլեմենտը
        System.out.print("The biggest number in array is: ");

        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.print(max);

        System.out.println();
        System.out.println();


        // տպել մասսիվի ամենափոքր էլեմենտը
        System.out.print("The smallest number in array is: ");
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.print(min);

        System.out.println();
        System.out.println();

        // տպել մասսիվի բոլոր զույգ էլեմենտները
        System.out.print("even numbers are: ");
        int even = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 & array[i] != 0) {
                even = array[i];
                System.out.print(even + " ");
            }
        }
        System.out.println();
        System.out.println();


        // տպել մասսիվի բոլոր կենտ էլեմենտները
        System.out.print("odd numbers are: ");
        int odd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1 & array[i] != 0) {
                odd = array[i];
                System.out.print(odd + " ");
            }
        }
        System.out.println();
        System.out.println();

        //տպել մասսիվի զույգ թվերի քանակը
        System.out.print("The count of even numbers from arrays is:");

        int evencount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 & array[i] != 0) {
                evencount++;
            }
        }
        System.out.print(" " + evencount);

        System.out.println('\n');


        //տպել մասսիվի կենտ թվերի քանակը
        System.out.print("The count of odd numbers from arrays is:");

        int oddcount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1 & array[i] != 0) {
                oddcount++;
            }
        }
        System.out.print(" " + oddcount);
        System.out.println('\n');

        // տպել մասսիվի բոլոր թվերի միջին թվաբանականը (բոլոր էլեմենտների գումարը / էլեմենտների քանակի վրա)
        System.out.print("The arithmetic average is: ");
        double aritmaver = 0;
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            aritmaver = sum / array.length;

        }
        System.out.print(aritmaver);

        System.out.println('\n');

        //տպել մասսիվի բոլոր էլեմենտների գումարը
        System.out.print("The summary of all elements from array is: ");
        int summary = 0;
        for (int i = 0; i < array.length; i++) {
            summary = summary + array[i];
        }
        System.out.print(summary);
        System.out.println();
    }

}


