package main.pkg2;

/*  Non static methods -
* In all of scenarios Runtime object is C - So even if you cast it to any other Type
* always m1() of class C will be executed
*
*  C c=new C();
* c.m1();         // C class method - m1()
* ((B)c).m1();    // C class method - m1()
* (A)((B)c).m1(); // C class method - m1()
*
*
* */

class A {
    public void m1() {
        System.out.println("A class method - m1()");
    }
}

class B extends A {
    public void m1() {
        System.out.println("B class method - m1()");
    }
}

    class C extends B{
        public void m1() {
            System.out.println("C class method - m1()");
        }
}
public class MemberAccess3 {
    public static void main(String[] args) {

/* In method overriding method reservation is always done by JVM based on Runtime object*/

C c=new C();
c.m1(); // C class method - m1()

B b = new C();
b.m1(); // C class method - m1()

A a=b;
a.m1(); // C class method - m1()
    }
}
