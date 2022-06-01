package homework.arrayutil;

//        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};
//        Պետք է գրենք կոդ, որը մասիվի էլեմենտները կդասավորի մեծից փոքր։
//        Այիսինքն մեր լոգիկան աշխատելուց հետո որ մասիվի բոլոր էլեմենտները տպենք,
//        պետք է դասավորած աճման կարգով տպի բոլոր էլեմենտները։
//        Սա ստացվելուց հետո մի հատ էլ նվազման կարգով դասավորեք։

public class ArraySort {
    public static void main(String[] args) {
        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};
        System.out.print("The numbers are in ascending order։ ");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length-1; j++) {
                if (numbers[i] > numbers[j]) {
                    int y = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = y;
                }
            }
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        System.out.print("The numbers are in descending order։ ");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    int y = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = y;
                }
            }
            System.out.print(numbers[i] + " ");
        }
    }
}

