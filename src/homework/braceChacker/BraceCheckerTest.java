package homework.braceChacker;

public class BraceCheckerTest {
    public static void main(String[] args) {
        String inputedtext = "Hello (from) [Java}";
        BraceChecker braceChecker = new BraceChecker(inputedtext);
        braceChecker.check();
    }
}
