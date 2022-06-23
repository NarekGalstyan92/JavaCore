package chapter8.homework;

// BoxWeight now fully implements all constructors
class BoxWeight extends Box {
    double weight; // weight of box

    //constructor clone of an object
    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }

    //constructor when all parameters are specified
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    // default constructor
    BoxWeight() {
        super();
        weight = -1;
    }

    // constructor used when cube is created
    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}
