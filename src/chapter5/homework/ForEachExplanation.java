package chapter5.homework;

public class ForEachExplanation {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int summ = 0;

        for (int i = 0; i < 10; i++) {
            summ += numbers[i];
            System.out.print(summ + " ");

        }
        System.out.println();

        //for-each version

        int [] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int x: nums) sum += x;

        }

    }

