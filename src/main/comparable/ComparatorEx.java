package main.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Comparator using external comparator class
//Student class is taken from other class - You can also create you student class here

public class ComparatorEx {
    public static void main(String[] args){

        ArrayList<Student> al=new ArrayList();
        al.add(new Student("vinay",10,"gadag"));
        al.add(new Student("vinay1",9,"gadag1"));
        al.add(new Student("vinay2",99,"gadag2"));

        Comparator cmp=new MyComparator();
        Collections.sort(al,cmp);
        System.out.println(al);

    }
}

class MyComparator implements Comparator<Student>{
    @Override
    public int compare(Student s1,Student s2){
        if (s1.age>s2.age) {
            return -1;
        }
        else {
            return 1;
        }
    }
}
