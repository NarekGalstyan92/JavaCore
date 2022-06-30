package chapter9.homework.stackexample;

// Create an interface variable and access stacks through it.

class IFTest3 {
    public static void main(String[] args) {
        IntSTack mystack; // create an interface reference variable
        DynStack ds = new DynStack(5);
        FixedSatck fs = new FixedSatck(8);

        mystack = ds; // load dynamic stack
        //push some numbers onto the stack
        for (int i = 0; i < 12; i++) {
            mystack.push(i);
        }

        mystack = fs;
        for (int i = 0; i < 8; i++) {
            mystack.push(i);
        }

        mystack = ds;
        System.out.println("Values on dynamic stack: ");
        for (int i = 0; i < 12; i++) {
            System.out.println(mystack.pop());
        }
        mystack = fs;
        System.out.println("Values on dynamic stack: ");
        for (int i = 0; i < 8; i++) {
            System.out.println(mystack.pop());
        }
    }
}
