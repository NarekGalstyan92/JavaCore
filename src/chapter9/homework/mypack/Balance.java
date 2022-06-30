package chapter9.homework.mypack;


/*Now the Balance class, its constructor, and its show()
method are public, This means, that they can be used by
non-subclass code outside their package
 */
public class Balance {
    String name;
    double bal;

    Balance (String n, double b) {
        name = n;
        bal = b;
    }

    public void show() {
        if (bal< 3) {
            System.out.println("--> ");
        }
        System.out.println(name + ": $" + bal);
    }
}
