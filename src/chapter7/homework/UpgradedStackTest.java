package chapter7.homework;

public class UpgradedStackTest {
    public static void main(String[] args) {
        UpgradedStack mystack1 = new UpgradedStack(5);
        UpgradedStack mystack2 = new UpgradedStack(8);

        // push some numbers onto the stack
        for (int i = 0; i < 5; i++) {
            mystack1.push(i);
        }
        for (int i = 0; i < 8; i++) {
            mystack2.push(i);
        }

        // pop some numbers onto the stack
        System.out.print("Stack in mystack1: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(mystack1.pop() + " ");
        }
        System.out.println();
        System.out.print("Stack in mystack2: " );
        for (int i = 0; i < 8; i++) {
            System.out.print(mystack2.pop() + " ");
        }
    }
}
