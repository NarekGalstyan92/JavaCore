package homework.figurepainter;

public class FigurePainter {

    char c = '*'; // global variable


    /*
     * *
     * * *
     * * * *
     * * * * *
     * * * * * *
     */

    int n = 5;
    void figureOne() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    //          *
    //        * *
    //      * * *
    //    * * * *
    //  * * * * *
    void figureTwo() {
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(c + " ");

            }
            System.out.println();

        }

    }

    /*
     * * * * *
     * * * *
     * * *
     * *
     *
     */
    void figureThree() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(c + " ");

            }
            System.out.println();

        }
    }

    //     * * * *
    //       * * *
    //         * *
    //           *
    void figureFour() {
        for (int i = 0; i < 4; i++) {
            System.out.print("    "); //էս բացատները արել եմ որ զուտ նկարի հետ բռնի :)
            for (int j = 4; j > i; j--) {
                System.out.print(c + " ");
            }
            System.out.println();
            for (int k = 0; k <= i; k++) {
                System.out.print("  ");

            }
        }
    }

    /*
     *       *
     *      * *
     *     * * *
     *    * * * *
     *     * * *
     *      * *
     *       *
     */

    void figureFive() {
        for (int i = 0; i < 4; i++) {
            System.out.print("   "); //էս բացատները արել եմ որ զուտ տնայինի նկարի հետ բռնի
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(c + " ");
            }
            System.out.println();

        }
        for (int i = 0; i < 3; i++) {
            System.out.print("    "); //
            for (int j = 3; j > i; j--) {
                System.out.print(" " + c);
            }
            System.out.println();
            for (int k = 0; k <= i; k++) {
                System.out.print(" ");
            }
        }
    }


}
