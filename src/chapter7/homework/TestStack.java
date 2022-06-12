package chapter7.homework;

public class TestStack {
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        // Push some numbers into the stack
        for (int i = 0; i < 10; i++) {
            mystack1.push(i);
        }
        for (int i = 10; i < 20; i++) {
            mystack2.push(i);
        }

        // Pop shose numbers off the stack
        System.out.print("Stack in mystack1: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(mystack1.pop() + " ");
        }
        System.out.println();
        System.out.print("Stack in mystack2: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(mystack2.pop() + " ");
        }
        //these statements are not legal
        // mystack.tos = -2;
        // mystack.stck[3] = 100;
    }
}
