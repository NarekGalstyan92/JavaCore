package chapter6.homework;

public class Box {
    double width;
    double height;
    double depth;

    //this is the constructor for Box
    Box ( double w, double h, double d) {

        width = w;
        height = h;
        depth = d;
    }
    double volume () {
        return width * height * depth;
    }
    /* Set dimensions of box*/
//    void setDim(double w, double h, double d) {
//        width = w;
//        height = h;
//        depth = d;
//    }
}
