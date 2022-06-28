package homework.books;

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
        for (int i = 0; i < size; i++) {
            if (array[i].getAuthorName().equals(authorName)) {
                System.out.println(array[i]);
            }
        }

    }

    public void printBookByGenre(String genre) {
        for (int i = 0; i < size; i++) {
            if (array[i].getGenre().equals(genre)) {
                System.out.println(array[i]);
            }
        }
    }

    public void printBooksByPriceRange(double minPrice, double maxPrice) {
        for (int i = 0; i < size; i++) {
            if (array[i].getPrice() >= minPrice && array[i].getPrice() <= maxPrice) {
                System.out.println(array[i]);
            }
        }
    }
}
