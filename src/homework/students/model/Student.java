package homework.students.model;

import java.util.Date;

import static homework.students.util.DateUtil.dateToString;

public class Student {

    private String name;
    private String surname;
    private int age;
    private String phoneNumber;
    private String city;
    private Lesson lesson;
    private User registeredUser;
    private Date registerDate;

    public Student(String name, String surname, int age, String phoneNumber,
                   String city, Lesson lesson, User registeredUser, Date registerdate) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.lesson = lesson;
        this.registeredUser = registeredUser;
        this.registerDate = registerdate;
    }

    public Student() {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public Date getRegisterdate() {
        return registerDate;
    }

    public void setRegisterdate(Date registerdate) {
        this.registerDate = registerdate;
    }

    public User getRegisteredUser() {
        return registeredUser;
    }

    public void setRegisteredUser(User registeredUser) {
        this.registeredUser = registeredUser;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", lesson ='" + lesson.getName() + '\'' +
                ", registeredUser ='" + registeredUser + '\'' +
                ", registeredDate ='" + dateToString(registerDate) + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
