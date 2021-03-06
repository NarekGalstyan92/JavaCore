package homework.students.storage;

import homework.students.model.Lesson;
import homework.students.model.Student;

public class StudentStorage {
    private Student[] array = new Student[10];
    private int size = 0;

    public void add(Student student) {
        if (array.length == size) {
            increaseArray();
        }
        array[size++] = student;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + array[i]);
        }
    }

    private void increaseArray() {
        Student[] temp = new Student[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    public void deleteByIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
        } else {
            for (int i = index; i < size; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
    }

    public void printStudentsByLessonName(String lessonName) {
        for (int i = 0; i < size; i++) {
            if (array[i].getLesson().equals(lessonName)) {
                System.out.println(array[i]);
            }
        }
    }

    public int getSize() {
        return size;
    }

    public void setLesson(int studentIndexByLesson, Lesson lesson) {
        if (studentIndexByLesson < 0 || studentIndexByLesson >= size) {
            System.out.println("Invalid index");
        } else {
            array[studentIndexByLesson].setLesson(lesson);

        }
    }

    public Student getSudentByIndex(int index) {
        if (index < 0 || index > size) {
            return null;
        } else {
            return array[index];
        }
    }
}

