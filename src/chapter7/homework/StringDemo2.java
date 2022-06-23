package chapter7.homework;

//Demonstrating some String methods
public class StringDemo2 {
    public static void main(String[] args) {
        String strOb1 = "First string";
        String strOb2 = "Second string";
        String strOb3 = strOb1;

        System.out.println("Length of strOb1: " + strOb1.length());
        System.out.println("Char at index 3 in strOb1: " + strOb1.charAt(3));

        if (strOb1.equals(strOb2)) {
            System.out.println("strOb1 == srtOb2");
        } else {
            System.out.println("StrOb1 != strOb2");
        }

        if (strOb1.equals(strOb3)) {
            System.out.println("strOb1 == srtOb3");
        } else {
            System.out.println("StrOb1 != strOb3");
        }
    }
}
