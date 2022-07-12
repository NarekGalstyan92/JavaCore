package chapter12.homework;

// Demonstrate ordinal(), compareTo(), and equals()

// An enumeration of apple varieties
public enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland;

    private double price; // price of each apple

    // Constructor
//    Apple(int p) {
//        price = p;
//
//    }

    public double getPrice() {
        return price;
    }
}
