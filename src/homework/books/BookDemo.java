package homework.books;

import homework.books.commands.Commands;
import homework.books.exceptions.AuthorNotFoundException;
import homework.books.id.Identification;
import homework.books.model.Author;
import homework.books.storage.AuthorStorage;
import homework.books.storage.BookStorage;
import homework.books.model.Book;

import java.util.Scanner;

public class BookDemo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();
    private static AuthorStorage authorStorage = new AuthorStorage();


    public static void main(String[] args) {

        Author Bulgakov = new Author("Mikhail", "Bulgakov", "abc@gmail.com", "male");
        Author Charents = new Author("Yeghishe", "Charents", "def@gmail.com", "male");
        Author Rowling = new Author("Joanne", "Rowling", "miban@mail.ru", "female");
        authorStorage.add(Bulgakov);
        authorStorage.add(Charents);
        authorStorage.add(Rowling);

        bookStorage.add(new Book("Master & Margarita", Bulgakov, 100, 1, "Novel"));
        bookStorage.add(new Book("Poems", Charents, 50, 1, "Novel"));
        bookStorage.add(new Book("Harry Potter", Rowling, 85, 20, "Fantasy"));

        /* I can make this part of code like I call this method after <<"run" is false>>, so (in future) another client
        can log in to the program, and it won't stop ever till closing the program manual
         */
        boolean start = true;
        while (start) {
            Identification.welcomePart();
            start = false;
        }

        boolean run = true;
        while (run) {
            Commands.printCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please choose correct number");
                command = -1;
            }
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
                case PRINT_BOOKS_BY_AUTHOR_SURNAME:
                    printBookByAuthorSurname();
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
                    System.out.println();
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
        if (!email.contains("@") | !email.contains(".com") & !email.contains(".ru")) {
            System.out.println("E-mail must contain symbols '@', and domains '.com' or '.ru' or '.am' ");
            addAuthor();
        }
        if (gender != null) {
            gender = gender.trim();
        }
        if (!gender.contains("male") & !gender.contains("female")) {
            System.out.println("Please be sure you entered 'male' or 'female' ");
            addAuthor();
        }

        Author author = new Author(authorName, authorSurname, email, gender);
        authorStorage.add(author);
        System.out.println("Author " + author + " created");
        System.out.println();

    }

    private static void printBooksByPriceRange() {
        System.out.println("Please input book's minimum price");
        double minPrice = 0;
        try {
            minPrice = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please enter only numbers. They must be without any symbols, white spaces or letters, be positive");
        }

        System.out.println("Please input book's maximum price");
        double maxPrice = 0;
        try {
            maxPrice = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please enter only numbers. They must be without any symbols, white spaces or letters and be positive numbers");
        }
        bookStorage.printBooksByPriceRange(minPrice, maxPrice);
    }

    private static void printBookByGenre() {
        System.out.println("Please input book's genre");
        String genre = scanner.nextLine();
        if (genre == null) {
            System.out.println("Please be sure you entered genre");
        } else {
            bookStorage.printBookByGenre(genre);
        }
    }

    private static void printBookByAuthorSurname() {
        if (authorStorage.getSize() != 0) {
            System.out.println("Please input author surname");
            String authorSurname = scanner.nextLine();
            if (authorSurname == null) {  // I have a problem here. if I enter nothing (just push Enter), this if doesn't work
                System.out.println("Please be sure you entered Author's name");
                printBookByAuthorSurname();
            } else {
                authorSurname.trim();
                bookStorage.printBookByAuthorName(authorSurname);
            }
        } else {
            System.out.println("You haven't any book in your storage");
        }
    }

    private static void showCountOfBooks() {
        System.out.println("Please enter book title");
        String title = scanner.nextLine();
        System.out.println(bookStorage.bookCount(title));
    }

    private static void addBook() {
        if (authorStorage.getSize() != 0) {
            System.out.println("Please choose author index");
            authorStorage.print();

            Author author = null;

            try {
                int authorIndex = Integer.parseInt(scanner.nextLine());
                if (authorIndex == authorStorage.getSize()) {
                    System.out.println("Invalid index");
                    return;
                }

                author = authorStorage.getAuthorByIndex(authorIndex);
                System.out.println("Please input books title");
                String title = scanner.nextLine();
                System.out.println("Please input book's price");
                int price = 0;
                try {
                    price = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Please enter only numbers. They must be without any symbols, white spaces or letters and be positive numbers");
                    addBook();
                }
                System.out.println("Please input book's count");
                int count = 0;
                try {
                    count = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Please enter only numbers. They must be without any symbols, white spaces or letters and be positive numbers");
                }

                System.out.println("Please input book's genre");
                String genre = scanner.nextLine();
                if (genre != null) {
                    genre.trim();
                } else {
                    System.out.println("Please input genre");
                    addBook();
                }

                Book book = new Book(title, author, price, count, genre);
                bookStorage.add(book);
                System.out.println("book added successfully!");
                System.out.println(book);

            } catch (AuthorNotFoundException | NumberFormatException e) {
                System.out.println("Please choose correct index or input correct number!!!");
                addBook();
            }
        }
    }


}

