package chapter7.homework;

// Use varargs with standard arguments
public class VarArgs2 {

    // here, msg is a normal parameter and v is a
    // varargs parameter
    static void vaTest(String msg, int ... v) {
        System.out.print(msg + v.length + " Contents: ");
        for(int x : v){
            System.out.print(x + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        vaTest("One vararg: ", 10);;
        vaTest("three vararg: s", 1, 2, 3);
        vaTest("No varargs: ");
    }
}
