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
        System.out.println("The negation of value is: " + ph5.reverseBool(7, 13)); //սրա ու ներքևինի վրա կաղացել եմ

        PracticeHomework ph6 = new PracticeHomework(); // մառոժնի եմ ուզում, վառվա սրաձեռը
        ph6.maxLenght(4, 8);


    }
}
