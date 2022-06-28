package homework.students;

import java.util.Scanner;

public class StudentDemo implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();

    public static void main(String[] args) {
        studentStorage.add(new Student("Poxos", "Poxosyan", 24, "091223344", "Gyumri", "Java"));
        studentStorage.add(new Student("Petros", "Petrosyan", 21, "098556677", "Yerevan", "MsQl"));
        studentStorage.add(new Student("Martiros", "Martirosyan", 30, "033123456", "Ashtarak", "PhP"));
        boolean run = true;
        while (run) {
            System.out.println("Please input " + EXIT + " to exit");
            System.out.println("Please input " + ADD_STUDENT + " to add student");
            System.out.println("Please input " + PRINT_ALL_STUDENTS + " to print all students");
            System.out.println("Please input " + DELETE_STUDENT_BY_INDEX + " to delete students by index");
            System.out.println("Please input " + PRINT_STUDENTS_BY_LESSON + " to print students by lesson");
            System.out.println("Please input " + PRINT_STUDENTS_COUNT + " to print students count");
            System.out.println("Please input " + CHANGE_STUDENT_LESSON + " to change student's lesson");
            int command = Integer.parseInt(scanner.nextLine());
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
                default:
                    System.out.println("Invalid command");

            }
        }


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
            System.out.println("Please choose lesson");
            String newLessonName = scanner.nextLine();
            if (newLessonName != null && !newLessonName.trim().equals("")) {
                student.setLesson(newLessonName.trim());
                System.out.println("Lesson name changed!");
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
        System.out.println("Please input student's name");
        String name = scanner.nextLine();
        System.out.println("Please input student's surname");
        String surname = scanner.nextLine();
        System.out.println("Please input student's age");
        String ageStr = scanner.nextLine();
        System.out.println("Please input student's phoneNumber");
        String phoneNumber = scanner.nextLine();
        System.out.println("Please input student's city");
        String city = scanner.nextLine();
        System.out.println("Please input student's lesson.");
        String lesson = scanner.nextLine();

        int age = Integer.parseInt(ageStr);
        if (lesson != null) {
            lesson = lesson.trim();
        }

        Student student = new Student(name, surname, age, phoneNumber, city, lesson);
        studentStorage.add(student);
        System.out.println("student created");
        System.out.println(student);
    }
}
