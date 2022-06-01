package chapter3.classwork;

public class ArrayExample1 {
    public static void main(String[] args) {
//        int[] numbers = new int[7];
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
//        numbers[0] = 15;
//
//        System.out.println(numbers[0]);

        int[] numbers = {4, 8, -7, 6, 0, 2, 982, 123};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");

        }
        numbers [10] = 711; //this is an error ArrayIndexOutOfBoundsExeption,
                            // because we dont have index 10 (max index in
                            // this example is 8)
    }
}
