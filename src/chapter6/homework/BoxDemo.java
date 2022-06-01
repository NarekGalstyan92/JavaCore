package chapter6.homework;

public class BoxDemo {
    public static void main(String[] args) {
       Box mybox1 = new Box(10, 20, 15);
       Box mybox2 = new Box(3, 6, 9);
       double vol;

        // assign values to mybox's instance variables
//        mybox1.setDim(10, 20, 15);
//        mybox2.setDim(3, 6, 9);

//        mybox1.width = 10;
//        mybox1.height = 20;
//        mybox1.depth = 15;
//
//        mybox2.width = 3;
//        mybox2.height = 6;
//        mybox2.depth = 9;


        //compute volume of boxes
        vol = mybox1.volume();
        System.out.println("Volume is " + vol);

        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
         /*or we could do System.out.println("Volume is " + mybox____.volume()); */

    }
}
