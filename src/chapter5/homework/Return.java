package chapter5.homework;

//Demonstrate return.

public class Return {
    public static void main(String[] args) {
        boolean t = true;

        System.out.println("before the return.");

        if (t) {
            return; //return to caller
            // էս տողից ներքև ինչ էլ լինի՝ չի աշխատելու, վերադառնում ենք այլ կանչվող մեթոդի
        }
        System.out.println("this won't execute");
    }
}
