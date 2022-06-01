package chapter3.homework;

public class Average {
    public static void main(String[] args) {

        double [] nums = {10.1, 11.2, 12.3, 13.4, 14.5 };
        double result = 0;

        int i;
        for (int j = 0; j < 5; j++)
             result = result + nums [j];
        System.out.println("Avarage is " + result/5);


        }

    }

