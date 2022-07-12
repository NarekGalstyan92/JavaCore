package chapter12.classwork;

public class EnumTest {
    public static void main(String[] args) {

        String genderStr = "FEMALE";

       try {
           Gender gender =  Gender.valueOf(genderStr.toUpperCase());
           System.out.println(gender);
       } catch (IllegalArgumentException e) {
           System.out.println("Please input correct gender");
       }
    }
}
