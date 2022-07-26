package chapter14.classwork;

import homework.students.model.Student;


class StorageDemo {
    public static void main(String[] args) {
        Storage<Integer> intStorage = new Storage<>();
        intStorage.add(88);

        Storage <String> strStorage = new Storage<>();
        strStorage.add("asdf");
        String str = strStorage.getByIndex(0);


        Storage<Student> studentStorage= new Storage<>();
        studentStorage.add(new Student());
        Student student = studentStorage.getByIndex(0);

//        Storage storage = new Storage();

//        intStorage.add(new Student); incorrect!!!
    }

}
