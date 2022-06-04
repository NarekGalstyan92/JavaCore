package homework.arrayutil;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        ArrayUtil au1 = new ArrayUtil();
//      au1.max(); //maximal value of aour array (just optional)
        System.out.println("Max value of array: " + au1.max()); // I do sout just for visualization

        ArrayUtil au2 = new ArrayUtil();
//      au2.min(); minimal value in array
        System.out.println("Min value of array: " + au2.min());

        ArrayUtil au3 = new ArrayUtil();
        System.out.print("Even numbers of array are: ");
        au3.even(); //calling method of printing even numbers
        System.out.println();

        ArrayUtil au4 = new ArrayUtil();
        System.out.print("Odd numbers of array are: ");
        au4.odd(); //calling method of printing odd numbers
        System.out.println();

        ArrayUtil au5 = new ArrayUtil();
//      au5.counteven(); //calling method of counting even numbers
        System.out.println("Count of even numbers is: " + au5.counteven());

        ArrayUtil au6 = new ArrayUtil();
//      au6.countodd(); //calling method of counting odd numbers
        System.out.println("Count of odd numbers is: " + au6.countodd());

        ArrayUtil au7 = new ArrayUtil();
//      au7.aritmAverage(); // Calling method of arithmetic average of the array
        System.out.println("The arithmetic average is: " + au7.aritmAverage());

        ArrayUtil au8 = new ArrayUtil();
//      au8.elementsummary(); //Calling method of elements summary
        System.out.println("The summary of all elements from array is: " + au8.elementsummary());









    }
}
