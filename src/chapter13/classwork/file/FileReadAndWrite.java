package chapter13.classwork.file;

import java.io.*;

class FileReadAndWrite {

    private static final String FILE_PATH = "C:\\Users\\gala8\\OneDrive\\Desktop\\Java 2021\\javacore\\JavaCore\\src\\chapter13\\classwork\\file\\example.txt";

    public static void main(String[] args) {
//        write();
        read();
    }

    public static void write() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            bw.write("H el lo fro m jav a \r\n");
            bw.write("Hello from java line 2!!!!!!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void read() {
        try (BufferedReader inputStream = new BufferedReader(new FileReader(FILE_PATH))) {
//            String line = "";
//            while ((line = inputStream.readLine()) != null) {
//                System.out.println(line);
//            }
            int c;
            int aCount = 0;
            while ((c = inputStream.read()) != -1) {
                char a = (char) c;
                if (a == 'a') {
                    aCount++;
                }
                System.out.println((char) c);
            }
            System.out.println("aCount = " + aCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

