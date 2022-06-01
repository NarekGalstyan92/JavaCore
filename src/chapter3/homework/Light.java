package chapter3.homework;

public class Light {
    public static void main(String[] args) {
        int lightspeed = 300_000;
        long day = 1;
        long seconds = day * 24 * 60 * 60;
        long distance = seconds * lightspeed;
        System.out.println("in " + day + " day the light will travel " + distance + " kilometers ");

    }
}
