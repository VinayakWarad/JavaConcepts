package main.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ALEx {
    public static void main(String[] args) {
        new ALEx().myTest();  // You need to create an object to call a non-static method
    }

    public void myTest() {
        ArrayList<String> al = new ArrayList<>();  // Use generics for type safety
        al.add("Hi");
        al.add("Test");
        al.add("Abc");
        //al.add(10);
        //al.add(900.99);
        Collections.sort(al);
        Collections.reverse(al);
        System.out.println(al);



        char c=65;
        System.out.println(c);
    }
}
