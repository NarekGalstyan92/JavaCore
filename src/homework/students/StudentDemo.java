package homework.students;

import homework.students.command.Commands;
import homework.students.exception.LessonNotFoundException;
import homework.students.model.Lesson;
import homework.students.model.Student;
import homework.students.model.User;
import homework.students.model.UserType;
import homework.students.storage.LessonStorage;
import homework.students.storage.StudentStorage;
import homework.students.storage.UserStorage;

import java.util.Scanner;

public class StudentDemo implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();
    private static LessonStorage lessonStorage = new LessonStorage();

    private static UserStorage userStorage = new UserStorage();

    private static User currentUser = null;


    public static void main(String[] args) {

        initData();

        boolean run = true;
        while (true) {
            Commands.printLoginCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }

            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case LOGIN:
                    login();
                    break;
                case REGISTER:
                    register();
                    break;
                default:
                    System.out.println("Invalid command");
                    System.out.println();
            }
        }
    }

    private static void login() {
        System.out.println("Please input email,password");
        String emailPasswordStr = scanner.nextLine();
        String[] emailPassword = emailPasswordStr.split(",");
        User user = userStorage.getUserByEmail(emailPassword[0]);
        if (user == null) {
            System.out.println("User with " + emailPassword[0] + " does not exist!");
        } else {
            if (user.getPassword().equals(emailPassword[1])) {
                currentUser = user;
                if (user.getUserType() == UserType.ADMIN) {
                    loginAdmin();
                } else if (user.getUserType() == UserType.USER) {
                    loginUser();
                }
            } else {
                System.out.println("Password is wrong!");

            }

        }
    }

    private static void loginUser() {
        System.out.println("Welcome " + currentUser.getName());
        boolean run = true;
        while (run) {
            Commands.printUserCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }

            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_ALL_STUDENTS:
                    studentStorage.print();
                    break;
                case PRINT_STUDENTS_BY_LESSON:
                    printStudentsByLessonName();
                    break;
                case PRINT_STUDENTS_COUNT:
                    System.out.println(studentStorage.getSize());
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case PRINT_ALL_LESSONS:
                    lessonStorage.print();
                    break;
                default:
                    System.out.println("Invalid command");
                    System.out.println();

            }
        }
    }

    private static void register() {
        System.out.println("Please enter name, surname, email, password");
        String userDataStr = scanner.nextLine();
        String[] userData = userDataStr.split(",");
        if (userData.length < 4) {
            System.out.println("Please input correct data!");
        } else {
            if (userStorage.getUserByEmail(userData[0]) == null) {
                User user = new User();
                user.setName(userData[0]);
                user.setSurname(userData[1]);
                user.setEmail(userData[2]);
                user.setPassword(userData[3]);
                user.setUserType(UserType.USER);
                userStorage.add(user);
                System.out.println("User created");
            } else {
                System.out.println("User with " + userData[0] + " already exist!");
            }
        }
    }

    private static void loginAdmin() {
        System.out.println("Welcome " + currentUser.getName());
        boolean run = true;
        while (run) {
            Commands.printAdminCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }

            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_ALL_STUDENTS:
                    studentStorage.print();
                    break;
                case DELETE_STUDENT_BY_INDEX:
                    deleteByIndex();
                    break;
                case PRINT_STUDENTS_BY_LESSON:
                    printStudentsByLessonName();
                    break;
                case PRINT_STUDENTS_COUNT:
                    System.out.println(studentStorage.getSize());
                    break;
                case CHANGE_STUDENT_LESSON:
                    changeStudentLessonName();
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case PRINT_ALL_LESSONS:
                    lessonStorage.print();
                    break;
                default:
                    System.out.println("Invalid command");
                    System.out.println();

            }
        }
    }

    private static void initData() {
        User admin = new User("admin", "admin", "admin@gmail.com", "admin", UserType.ADMIN);
        userStorage.add(admin);

        Lesson java = new Lesson("Java", "teacher", 7, 35000);
        Lesson mysql = new Lesson("mysql", "teacher mysql", 7, 35000);
        Lesson php = new Lesson("php", "teacher php", 7, 35000);
        lessonStorage.add(java);
        lessonStorage.add(mysql);
        lessonStorage.add(php);

        studentStorage.add(new Student("Poxos", "Poxosyan", 24, "091223344", "Gyumri", java, admin));
        studentStorage.add(new Student("Petros", "Petrosyan", 21, "098556677", "Yerevan", mysql, admin));
        studentStorage.add(new Student("Martiros", "Martirosyan", 30, "033123456", "Ashtarak", php, admin));
    }

    private static void addLesson() {
        System.out.println("Please input lesson name");
        String lessonName = scanner.nextLine();
        System.out.println("Please input lesson teacher name");
        String teacherName = scanner.nextLine();
        System.out.println("Please input lesson duration by months");
        int duration = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input lesson price");
        double price = Double.parseDouble(scanner.nextLine());

        Lesson lesson = new Lesson(lessonName, teacherName, duration, price);
        lessonStorage.add(lesson);
        System.out.println("lesson created");


    }

    private static void changeStudentLessonName() {
        studentStorage.print();
        System.out.println("Please choose student by index");
        int index = Integer.parseInt(scanner.nextLine());
        Student student = studentStorage.getSudentByIndex(index);
        if (student == null) {
            System.out.println("Wrong Index!!!");
            changeStudentLessonName();
        } else {
            if (lessonStorage.getSize() != 0) {
                lessonStorage.print();
                System.out.println("Please choose lesson index");
                try {
                    int lessonIndex = Integer.parseInt(scanner.nextLine());
                    Lesson lesson = lessonStorage.getLessonByIndex(lessonIndex);
                    student.setLesson(lesson);
                    System.out.println("lesson changed!");
                } catch (LessonNotFoundException | NumberFormatException e) {
                    System.out.println("Please input correct number or index!");
                    changeStudentLessonName();
                }
            }
        }

    }

    private static void printStudentsByLessonName() {
        System.out.println("Please input lesson name");
        String lessonName = scanner.nextLine();
        studentStorage.printStudentsByLessonName(lessonName);
    }

    private static void deleteByIndex() {
        studentStorage.print();
        System.out.println("Please choose student index");
        int index = Integer.parseInt(scanner.nextLine());
        studentStorage.deleteByIndex(index);
    }

    private static void addStudent() {
        if (lessonStorage.getSize() != 0) {
            System.out.println("Please choose lesson index");
            lessonStorage.print();
            System.out.println();

            Lesson lesson = null;
            try {
                int lessonIndex = Integer.parseInt(scanner.nextLine());

                lesson = lessonStorage.getLessonByIndex(lessonIndex);
                System.out.println("Please input student's name");
                String name = scanner.nextLine();
                System.out.println("Please input student's surname");
                String surname = scanner.nextLine();
                System.out.println("Please input student's age");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.println("Please input student's phoneNumber");
                String phoneNumber = scanner.nextLine();
                System.out.println("Please input student's city");
                String city = scanner.nextLine();

                Student student = new Student(name, surname, age, phoneNumber, city, lesson, currentUser);
                studentStorage.add(student);
                System.out.println("student created");
                System.out.println(student);

            } catch (LessonNotFoundException | NumberFormatException e) {
                System.out.println("Please choose correct index or input correct number!!!");
                addStudent();
            }
        }
    }
}
