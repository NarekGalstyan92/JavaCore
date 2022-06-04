package calculator;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator ();
        double plusResult = myCalculator.plus (4, 5);
        System.out.println(plusResult);

        Calculator myCalculator1 = new Calculator ();
        double minusResult = myCalculator.minus (6, 5);
        System.out.println();

        Calculator myCalculator2 = new Calculator ();
        double multiplyResult = myCalculator.multiply (2, 3);
        System.out.println();

        Calculator myCalculator3 = new Calculator ();
        double divideResult = myCalculator.divide (8, 2);
        System.out.println();

        }
}
