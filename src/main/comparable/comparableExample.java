package main.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class comparableExample {
    public static void main(String args[]){

        ArrayList<Student> al=new ArrayList();
al.add(new Student("vinay",10,"gadag"));
        al.add(new Student("vinay1",9,"gadag1"));
        al.add(new Student("vinay2",99,"gadag2"));

        Collections.sort(al);
        System.out.println(al);
        }
}

class Student implements Comparable<Student>{
    String name;
    int age;
    String address;

    public Student(String name, int age, String address) {
        this.name=name;
        this.address=address;
        this.age=age;
    }

    @Override
    public String toString() {
//        return "Student{name='" + name + "', age=" + age + "}";
        return "Student{name='" + name + "',age='" + age + "',address='" + address + "'+}";
    }

    @Override
    public int hashCode(){
        return 10;
        }

        @Override
    public int compareTo(Student s){
        if (this.age>s.age) {
            return -1;
        }
        else {
            return 1;
        }
        }

}
