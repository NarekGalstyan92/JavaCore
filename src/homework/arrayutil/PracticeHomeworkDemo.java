package homework.arrayutil;

public class PracticeHomeworkDemo {
    public static void main(String[] args) {
        PracticeHomework ph1 = new PracticeHomework();
        System.out.println("There are " + ph1.convert(5));

        PracticeHomework ph2 = new PracticeHomework();
        System.out.println("Next number of invested number is: " + ph2.nextNumber(5));

        PracticeHomework ph3 = new PracticeHomework();
        System.out.println("Statment a = b is: " + ph3.isSameNum(4, 5));

        PracticeHomework ph4 = new PracticeHomework();
        System.out.println("The statment that a <= 0 is: " + ph4.lessThanOrEqualToZero(150));

        PracticeHomework ph5 = new PracticeHomework();
        System.out.println("The negation of value is: " + ph5.reverseBool(true));

        PracticeHomework ph6 = new PracticeHomework();
        int [] array1 = {3, 4, 5};
        int [] array2 = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("longhest array ends with " + ph6.maxLenght(array1, array2));

        PracticeHomework ph7 = new PracticeHomework();
        System.out.println("There are " + ph7.calcAge(1) + " days in your inputted years");


    }
}
