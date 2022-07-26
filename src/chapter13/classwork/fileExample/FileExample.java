package chapter13.classwork.fileExample;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

class FileExample {

    static String filePath = "C:\\Users\\gala8\\OneDrive\\Desktop\\Java 2021\\javacore\\JavaCore\\src\\chapter13\\classwork\\testFolder\\hello.txt";
    static String newFilePath = "C:\\Users\\gala8\\OneDrive\\Desktop\\Java 2021\\javacore\\JavaCore\\src\\chapter13\\classwork\\testFolder\\hello3.txt";

    public static void main(String[] args) throws IOException {

        File myFile = new File(filePath);

        boolean b = myFile.renameTo(new File(newFilePath));
        System.out.println(b);


//        System.out.println(myFile.exists());
//        if (!myFile.exists()){
//            myFile.createNewFile();
//            System.out.println(myFile.exists());
//        }
//        System.out.println("isFile: " + myFile.isFile());
//        System.out.println("isDirectory: " + myFile.isDirectory());
//        if (myFile.isDirectory()) {
//            File[] files = myFile.listFiles();
//            for (File file : files) {
//                if (file.isDirectory())
//                System.out.println(file.getName());
//            }
//        }
    }

    public static void write() throws IOException {
        DataOutputStream out = new DataOutputStream(new FileOutputStream(filePath));
        out.flush();
        out.close();
    }
}
