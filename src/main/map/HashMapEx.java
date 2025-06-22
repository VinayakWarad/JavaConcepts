package main.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class HashMapEx {
    public static void main(String[] args) {


        HashMap tm=new HashMap<>();
        tm.put(20,333);
        tm.put(1,10);
        tm.put(2,20);
        Iterator iterator= tm.entrySet().iterator();
        System.out.println(tm.get(20));

        System.out.println(tm.entrySet());
        while (iterator.hasNext()){
            Map.Entry m=(Map.Entry)iterator.next();
            System.out.println(m.getKey()); // Lists out all keys
            m.getKey();
        }
    }
}
