package homework.braceChacker;

public class BraceChecker {

    private String text;
    int tos;

    int i = 0;

    public BraceChecker(String inputedtext) {
        this.text = inputedtext;
        for (int i = 0; i < text.length(); i++) {
            this.i = i++;
        }
    }

    char[] stck = new char[i];
    char c = 0;

    void push() {
        if (c == '(' || c == '[' || c == '{') {
            ++tos;
        }
    }

    void pop() {
        if (c == ')' || c == ']' || c == '}') {
            char c1 = stck[tos--];
        }
    }

    public void check() {
        char b = text.charAt(0);
        System.out.println("Hi");
    }

}




