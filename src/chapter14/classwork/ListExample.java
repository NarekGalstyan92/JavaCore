package chapter14.classwork;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class ListExample {
    public static void main(String[] args) {

        List<String> list = new LinkedList<>(); //LinkedList can by also ArrayList, but difference is in work speed

        list.add("Poxos");
        for (int i = 0; i < 1000; i++) {
            list.add("poxos" + i);
        }
        for (String s : list) {
            System.out.println(s);
        }
//        print(arrayList);

//        LinkedList<String> linkedList = new LinkedList<>();
//        print(linkedList);
    }


    public static void print (List<String> items) {
        for (String item : items) {
            System.out.println(item);
        }
    }
}
