package homework.students.command;

public interface Commands {
    int LOGOUT = 0;
    int ADD_STUDENT = 1;
    int PRINT_ALL_STUDENTS = 2;
    int DELETE_STUDENT_BY_INDEX = 3;
    int PRINT_STUDENTS_BY_LESSON = 4;
    int PRINT_STUDENTS_COUNT = 5;
    int CHANGE_STUDENT_LESSON = 6;
    int ADD_LESSON = 7;
    int PRINT_ALL_LESSONS = 8;

    int EXIT = 0;
    int LOGIN = 1;
    int REGISTER = 2;



    static void printAdminCommands() {
        System.out.println("Please input " + LOGOUT + " to logout");
        System.out.println("Please input " + ADD_STUDENT + " to add student");
        System.out.println("Please input " + PRINT_ALL_STUDENTS + " to print all students");
        System.out.println("Please input " + DELETE_STUDENT_BY_INDEX + " to delete students by index");
        System.out.println("Please input " + PRINT_STUDENTS_BY_LESSON + " to print students by lesson");
        System.out.println("Please input " + PRINT_STUDENTS_COUNT + " to print students count");
        System.out.println("Please input " + CHANGE_STUDENT_LESSON + " to change student's lesson");
        System.out.println("Please input " + ADD_LESSON + " to add lesson");
        System.out.println("Please input " + PRINT_ALL_LESSONS + " to print all lessons");
    }

    static void printUserCommands() {
        System.out.println("Please input " + LOGOUT + " to logout");
        System.out.println("Please input " + ADD_STUDENT + " to add student");
        System.out.println("Please input " + PRINT_ALL_STUDENTS + " to print all students");
        System.out.println("Please input " + PRINT_STUDENTS_BY_LESSON + " to print students by lesson");
        System.out.println("Please input " + PRINT_STUDENTS_COUNT + " to print students count");
        System.out.println("Please input " + PRINT_ALL_LESSONS + " to print all lessons");
    }

    static void printLoginCommands() {
        System.out.println("Please input " + EXIT + " to exit");
        System.out.println("Please input " + LOGIN + " to login");
        System.out.println("Please input " + REGISTER + " to register");
    }
}
