package main.pkg2;

class SuperClass1 {
    public void m1() {
    System.out.println("Superclass m1()");
    }
    public void m2(){
        System.out.println("Concrete method of m1");
    }
}

class SubClass1 extends SuperClass1{
    public void m1() {
        System.out.println("Subclass m1()");
    }
}

public class MemberAccess1 {
    public static void main(String[] args){

/* If super class and subclass have methods with same name"m1()" then by creating object of subclass
if you call that method then subclass method will get executed*/
SubClass1 s1=new SubClass1();
s1.m1();

/*
WIth help of subclass object you call both subclass and supercall methods. But by superclass object
you can't call subclass methods
*/

/* If superclass and subclass have methods with same name, then by creating object of superclass
if you call that method then superclass method will get executed*/
SuperClass1 superClass1=new SuperClass1();
superClass1.m1();

/*You can create a object of subclass and store in superclass ref variable.
 Now if you call m1() then m1() of subclass will be called (Condition - method should be non static)*/
SuperClass1 sup=new SubClass1();
sup.m1();
    }
}
