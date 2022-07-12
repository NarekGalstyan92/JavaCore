package chapter12.classwork;

import java.util.Scanner;

public class LanguageTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(Integer.MAX_VALUE);
//        Language lang = Language.RU;
//
//       switch (lang) {
//           case HY:
//               System.out.println("Ողջւյն");
//               break;
//           case ENG:
//               System.out.println("Hello");
//               break;
//           case RU:
//               System.out.println("Привет");
//               break;
//           default:
//               System.out.println("HOLA");
//               break;
//       }

        System.out.println("please choose language from list");

        Language[] values = Language.values();
        for (Language value : values) {
            System.out.println(value + ", ");
        }
        Language.CH.setCountry("China");
        System.out.println();
        String langStr = scanner.nextLine();
        if (langStr != null) {
            try {
                Language chosenLang = Language.valueOf(langStr.toUpperCase());
                System.out.println("chosen: " + chosenLang);
                System.out.println("country: " + chosenLang.getCountry());
                System.out.println("index: " + chosenLang.ordinal());
            } catch (IllegalArgumentException e) {
                System.out.println("Please choose correct Language");
            }
        }
    }
}
