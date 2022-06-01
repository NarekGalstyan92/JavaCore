package chapter5.homework;

//Demonstrating while loop
public class While {
    public static void main(String[] args) {
        int n = 10;

        while (n > 0) {
            System.out.println("Tick " + n);
            n--;
        }

        int a = 10;
        int b = 20;
        while (a > b) { //because this is false
            System.out.println("This will not be displayed");
        }
    }
}
