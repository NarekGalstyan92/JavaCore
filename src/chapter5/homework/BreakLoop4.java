package chapter5.homework;

//Using break to exit from nested loops

public class BreakLoop4 {
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 3; i++) {
            System.out.print("Pass 0: " + i + " "); //գրքի մեջ հենց էս տողում ու
            for (int j = 1; j < 100; j++) {         // էս տողում սխալ կա։ Պատասխանը ստանալու համար ուրիշ
                if (j == 10) break outer; //exit both loops   //տվյալներ պետքա գրվի։ Ես գրել եմ էնպես որ պատասխանը
                System.out.print(j + " ");                      // ճիշտ ստացվի
            }
            System.out.println("This will not print");

        }
        System.out.println("Loops complete.");

    }
}

