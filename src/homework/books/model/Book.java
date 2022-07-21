package homework.books.model;

import java.util.Date;

import static homework.books.util.DateUtil.dateToString;


public class Book {
    private String title;
    private Author author;
    private double price;
    private int count;
    private String genre;

    private User registeredUser;
    private Date registerDate;

    public Book(String title, Author author, double price, int count,
                String genre, User registeredUser, Date registerDate) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.count = count;
        this.genre = genre;
        this.registeredUser = registeredUser;
        this.registerDate = registerDate;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public User getRegisteredUser() {
        return registeredUser;
    }

    public void setRegisteredUser(User registeredUser) {
        this.registeredUser = registeredUser;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + '\'' + author.getSurname() + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", genre='" + genre + '\'' +
                ", book added by " + '\'' + registeredUser.getName() + '\'' +
                ", registration date " + '\'' + dateToString(registerDate) + '\'' +
                '}';
    }
}
