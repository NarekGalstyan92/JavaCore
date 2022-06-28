package homework.books;

import homework.students.StudentStorage;

import java.util.Scanner;

public class BookDemo implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();

    public static void main(String[] args) {
        bookStorage.add(new Book("Master & Margarita", "Bulgakov", 75.0, 1, "Novel"));
        bookStorage.add(new Book("Samuel", "Raffi", 125.0, 1, "Novel"));
        bookStorage.add(new Book("Harry Potter", "Rowling", 100.0, 1, "Fantasy"));
        boolean run = true;
        while (run) {
            System.out.println("Please input " + EXIT + " to exit");
            System.out.println("Please input " + ADD_BOOK + " to add book");
            System.out.println("Please input " + PRINT_ALL_BOOKS + " to print all books");
            System.out.println("Please input " + PRINT_BOOKS_BY_AUTHOR_NAME + " to print books by author name");
            System.out.println("Please input " + PRINT_BOOKS_BY_GENRE + " to print books by genre");
            System.out.println("Please input " + PRINT_BOOKS_BY_PRICE_RANGE + " to print books by price range");
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.print();
                    break;
                case PRINT_BOOKS_BY_AUTHOR_NAME:
                    printBookByAuthorName();
                    break;
                case PRINT_BOOKS_BY_GENRE:
                    printBookByGenre();
                    break;
                case PRINT_BOOKS_BY_PRICE_RANGE:
                    printBooksByPriceRange();
                    break;
                default:
                    System.out.println("Invalid command");

            }
        }
    }

    private static void printBooksByPriceRange() {
        System.out.println("Please input book's minimum price");
        double minPrice = Double.parseDouble(scanner.nextLine());
        System.out.println("Please input book's maximum price");
        double maxPrice = Double.parseDouble(scanner.nextLine());
        bookStorage.printBooksByPriceRange(minPrice, maxPrice);
    }

    private static void printBookByGenre() {
        System.out.println("Please input book's genre");
        String genre = scanner.nextLine();
        bookStorage.printBookByGenre(genre);
    }

    private static void printBookByAuthorName() {
        System.out.println("Please input author name");
        String authorName = scanner.nextLine();
        bookStorage.printBookByAuthorName(authorName);
    }

    private static void addBook() {
        System.out.println("Please input books title");
        String title = scanner.nextLine();
        System.out.println("Please input book's author name");
        String authorName = scanner.nextLine();
        System.out.println("Please input book's price");
        String priceStr = scanner.nextLine();
        System.out.println("Please input book's count");
        String bookCount = scanner.nextLine();
        System.out.println("Please input book's genre");
        String genre = scanner.nextLine();


        int price = Integer.parseInt(priceStr);
        int count = Integer.parseInt(bookCount);
        if (title != null) {
            title = title.trim();
        }
        if (authorName != null) {
            authorName = authorName.trim();
        }
        if (genre != null) {
            genre = genre.trim();
        }

        Book book = new Book(title, authorName, price, count, genre);
        bookStorage.add(book);
        System.out.println("book added successful!");
        System.out.println(book);
    }
}
