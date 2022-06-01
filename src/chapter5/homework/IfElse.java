package chapter5.homework;

public class IfElse {
    public static void main(String[] args) {
        int mounth = 4; //April
        String season;
        if (mounth == 12 || mounth == 1 || mounth == 2)
            season = "a winter";
        else if (mounth == 3 || mounth == 4 || mounth == 5)
            season = "a spring";
        else if (mounth == 6 || mounth == 7 || mounth == 8)
            season = "a summer";
        else if (mounth == 9 || mounth == 10 || mounth == 11)
            season = "an autumn";
        else
            season = "a mysterious month";

        System.out.println("April is " + season + ".");

    }
}
