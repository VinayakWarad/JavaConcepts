package main.comparable;

import java.util.ArrayList;
import java.util.Comparator;

public class CmprtsUsingAnonymousClass {
    public static void main(String[] args) {
        ArrayList<Student1> al = new ArrayList();
        al.add(new Student1("vinay", 10, "gadag"));
        al.add(new Student1("vinay1", 9, "gadag1"));
        al.add(new Student1("vinay2", 99, "gadag2"));

        Comparator<Student1> student1Comparator=new  Comparator<Student1>() {
            @Override
            public int compare(Student1 s1, Student1 s2) {
                if (s1.age>s2.age) {
                    return -1;
                }
                else {
                    return 1;
                }
            }
        };

    }
}
