package homework.books;

import java.util.Arrays;

public class BookStorage {
    private Book[] array = new Book[10];
    private int size = 0;

    private void increaseArray() {
        Book[] temp = new Book[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    public void add(Book book) {
        if (array.length == size) {
            increaseArray();
        }
        array[size++] = book;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + array[i]);
        }
    }

    public void printBookByAuthorName(String authorName) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i].getAuthorName().equals(authorName)) {
                count++;
                System.out.println(array[i]);
            }
            if (count == 0) {
                System.out.println("Author not found");
                break;
            }

        }
    }

    public void printBookByGenre(String genre) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i].getGenre().equals(genre)) {
                count++;
                System.out.println(array[i]);
            }
            if (count ==0){
                System.out.println("Genre not found");
                break;
            }
        }
    }

    public void printBooksByPriceRange(double minPrice, double maxPrice) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i].getPrice() >= minPrice && array[i].getPrice() <= maxPrice) {
                count++;
                System.out.println(array[i]);
            }
            if (count ==0) {
                System.out.println("Sorry, no match");
                break;
            }
        }
    }
}
