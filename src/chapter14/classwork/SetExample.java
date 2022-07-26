package chapter14.classwork;

import chapter13.classwork.serialization.Student;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
//        Set<String> treeSet = new TreeSet<>();
//        treeSet.add("Zaven");
//        treeSet.add("Poxos");
//        treeSet.add("Aram");
//
//        for (String s : treeSet) {
//            System.out.println(s);
//        }




//TreeSet sorts from A to Z
//        Set<Student> treeSet = new TreeSet<>(); // this code throws ClassCastException
//        treeSet.add(new Student());
//
//
//        for (Student student : treeSet) {
//            System.out.println(student);
//        }



        Set<String> hashSet = new HashSet<>();
        hashSet.add("poxos");
        hashSet.add("babken");
        hashSet.add("martiros");
        hashSet.add("zaven");
        hashSet.add("aram");


        for (String s : hashSet) {
            System.out.println(s);
        }
    }
}
