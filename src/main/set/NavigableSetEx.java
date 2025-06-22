package main.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetEx {
    public static void main(String[] args) {
        NavigableSet navigableSet=new TreeSet();
        navigableSet.add(1998);
        navigableSet.add(1998);
                navigableSet.add(5000);
        navigableSet.add(2000);
        navigableSet.add(3000);
        navigableSet.add(4000);

        System.out.println(navigableSet);
        System.out.println(navigableSet.floor(1999));
    }
}
