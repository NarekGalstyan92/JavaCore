package homework.braceChacker;

public class BraceChecker {

    private String text;
    private Stack stack = new Stack();
    private Stack stackForIndex = new Stack();

    public BraceChecker(String inputedtext) {
        this.text = inputedtext;

    }

    public void check() {

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int last;
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    stackForIndex.push(i);
                    break;
                case ')':
                    last = stack.pop();
                    stackForIndex.pop();
                    stack.pop();
                    if (last == 0){
                        System.out.println("Error: closed " + c + " but not closed");
                    }else if (last != '(') {
                        System.out.println("Error: closed " + c + " but opened " + (char)last + " at " + i);
                    }
                    break;
                case '}':
                    last = stack.pop();
                    stackForIndex.pop();
                    stack.pop();
                    if (last == 0){
                        System.out.println("Error: closed " + c + " but not closed");
                    }else if (last != '{') {
                        System.out.println("Error: closed " + c + " but opened " + (char)last + " at " + i);
                    }
                    break;
                case ']':
                    last = stack.pop();
                    stackForIndex.pop();
                    stack.pop();
                    if (last == 0){
                        System.out.println("Error: closed " + c + " but not closed");
                    }else if (last != '[') {
                        System.out.println("Error: closed " + c + " but opened " + (char)last + " at " + i);
                    }
                    break;
            }
        }
        //while (!stack.isEmpty()) {
//    System.out.println("Error: opened " + (char)last + " but not closed");
//}
        int last;
        while ((last = stack.pop()) != 0) {
            System.out.println("Error: opened " + (char)last + " but not closed at " + stackForIndex.pop());
        }



    }
}
