package main.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListEx {
    public static void main(String args[]) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Hi");
        al.add("how");
        al.add("are");
        al.add("you");
        al.add("my");
        al.add("friend");
        al.add("hi");
        al.trimToSize();

        al.remove("friend");
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("friend1");
        al1.add("hi1");
        al.addAll(al1);
        //al.removeAll(al1);
        al.isEmpty();
        //al.clear();
        //al.removeAll(al1);
        al.add(0,"Initial");
        //al.size();
        //al.isEmpty();
        al.set(1,"exOfSet");
        al.subList(4,6);
        //al.sort();
        al.trimToSize();
        Collections.sort(al);

    }
}