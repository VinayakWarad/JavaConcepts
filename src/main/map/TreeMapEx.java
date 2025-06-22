package main.map;

import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {

        TreeMap tm=new TreeMap<>();
        tm.put(20,333);
        tm.put(1,10);
        tm.put(2,20);

        System.out.println(tm.headMap(2));
        tm.firstKey();

        System.out.println(tm.firstKey());
        System.out.println(tm.lastKey()+"test");
        System.out.println(tm.headMap(1));
        System.out.println(tm.tailMap(1));
        System.out.println("");
    }
}
