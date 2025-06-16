package main.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEx {

    public static void main(String args[]){
        List<String> list = new ArrayList<>();
        list.add("Keep");
        list.add("RemoveMe");
        list.add("KeepToo");

        Iterator itr=list.iterator();
        while (itr.hasNext()){
            String s=(String) itr.next();
            System.out.println(s);
            itr.remove();
        }
        System.out.println(list);
    }
}
