package main.comparable;

//Comparator using Anonymous class

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CmprtrUsingLambda {
    public static void main(String[] args){
        ArrayList<Student1> al=new ArrayList();
        al.add(new Student1("vinay",10,"gadag"));
        al.add(new Student1("vinay1",9,"gadag1"));
        al.add(new Student1("vinay2",99,"gadag2"));

      //  Comparator<Student1> cmp=(s1, s2) -> Integer.compare(s2.getAge(),s1.getAge());
                            //OR
      //Comparator<Student1> cmp = Comparator.comparingInt(Student1::getAge);
                            //OR
        Comparator<Student1> cmp=(s1, s2) -> {
         return  s1.getAge()>s2.getAge() ? 1 :
            s1.getAge()<s2.getAge() ? -1 :0;
        };

        Collections.sort(al,cmp);
        System.out.println(al);

    }
}

class Student1 {
    String name;
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    int age;
    String address;

    public Student1(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student1{name='" + name + "', age='" + age + "', address='" + address + "'}";
    }
}

