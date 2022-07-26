package chapter13.classwork.serialization;

import java.io.*;

class SerializationDemo {

    private static final String FILE_PATH = "C:\\Users\\gala8\\OneDrive\\Desktop\\Java 2021\\javacore\\JavaCore\\src\\chapter13\\classwork\\serialization\\example.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        Student student = new Student("poxos", "poxosyan", 45, "123456");
//
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
//
//        objectOutputStream.writeObject(student);
//        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_PATH));
        Object object = objectInputStream.readObject();
        Student student = (Student) object;
        System.out.println(student);


    }
}
