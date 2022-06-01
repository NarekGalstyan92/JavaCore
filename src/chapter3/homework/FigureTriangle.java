package chapter3.homework;

//     * * * *
//       * * *
//         * *
//           *


public class FigureTriangle {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.print("    "); //էս բացատները արել եմ որ զուտ նկարի հետ բռնի :)
            for (int j = 4; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
            for (int k = 0; k <= i; k++) {
                System.out.print("  ");

            }
        }
    }
}