package homework.books;

import homework.books.commands.Commands;
import homework.books.model.Author;
import homework.books.storage.AuthorStorage;
import homework.books.storage.BookStorage;
import homework.books.model.Book;
import homework.students.model.Lesson;

import java.util.Scanner;


public class BookDemo implements Commands {
    private static homework.books.model.Author Author;
    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();
    private static AuthorStorage authorStorage = new AuthorStorage();


    public static void main(String[] args) {

//        Author Bulgakov = new Author("Aleksandr", "Bulgakov", "abc@gmail.com", "male");
//        Author Charents = new Author("Yeghishe", "Charents", "def@gmail.com", "male");
//        Author Rowling = new Author("Joanne", "Rowling", "miban@gmail.com", "female");
//        authorStorage.add(Bulgakov);
//        authorStorage.add(Charents);
//        authorStorage.add(Rowling);
//
//
//        bookStorage.add(new Book("Master & Margarita", Bulgakov, 1, "Novel"));
//        bookStorage.add(new Book("Poems", Charents, 1, "Novel"));
//        bookStorage.add(new Book("Harry Potter", Rowling, 3, "Fantasy"));

        boolean run = true;
        while (run) {
            Commands.printCommands();
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
                case SHOW_COUNT_OF_BOOKS_BY_AUTHOR:
                    showCountOfBooks();
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case PRINT_ALL_AUTHORS:
                    authorStorage.print();
                    break;
                default:
                    System.out.println("Invalid command");

            }
        }
    }

    private static void addAuthor() {
        System.out.println("Input author's name");
        String authorName = scanner.nextLine();
        System.out.println("Input author's surname");
        String authorSurname = scanner.nextLine();
        System.out.println("Input author's e-mail");
        String email = scanner.nextLine();
        System.out.println("Input author's gender (male or female)");
        String gender = scanner.nextLine();

        if (authorName != null) {
            authorName = authorName.trim();
        }
        if (authorSurname != null) {
            authorSurname = authorSurname.trim();
        }
        if (email != null) {
            email = email.trim();
        }
        if (gender != null) {
            gender = gender.trim();
        }

        Author author = new Author(authorName, authorSurname, email, gender);
        authorStorage.add(author);
        System.out.println("Author " + author + " created");
        System.out.println();

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

    private static void showCountOfBooks() {
        System.out.println("Please enter book title");
        String title = scanner.nextLine();
        System.out.println(bookStorage.bookCount(title));
    }

    private static void addBook() {
        if (authorStorage.getSize() != 0) {
            authorStorage.print();
            System.out.println("Please choose author index");
            int authorIndiex = Integer.parseInt(scanner.nextLine());
            Author author = authorStorage.getAuthorByIndex(authorIndiex);
            if (author == null) {
                System.out.println("Please choose correct index!!!");
                addBook();
            } else {
                System.out.println("Please input books title");
                String title = scanner.nextLine();
                System.out.println("Please input book's price");
                int price = Integer.parseInt(scanner.nextLine());
                System.out.println("Please input book's count");
                int count = Integer.parseInt(scanner.nextLine());
                System.out.println("Please input book's genre");
                String genre = scanner.nextLine();

                if (title != null) {
                    title = title.trim();
                }
                if (genre != null) {
                    genre = genre.trim();
                }

                Book book = new Book(title, author, price, count, genre);
                bookStorage.add(book);
                System.out.println("book added successfully!");
                System.out.println(book);
            }
        }

    }
}
