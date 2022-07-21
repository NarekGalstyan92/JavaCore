package homework.books.model;

import java.util.Date;

import static homework.students.util.DateUtil.dateToString;

public class Author {
    private String name;
    private String surname;
    private String email;
    private String gender;
    private Date registrationDate;

    public Author(String name, String surname, String email, String gender, Date registrationDate) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.gender = gender;
        this.registrationDate = registrationDate;
    }

    public Author() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", date of registration ='" + dateToString(registrationDate) + '\'' +
                '}';
    }
}
