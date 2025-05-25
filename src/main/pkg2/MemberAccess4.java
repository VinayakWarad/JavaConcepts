package main.pkg2;


/* Method reservation always takes place by compiler based on reference type of object
*
*   C c=new C();
* c.m1();         // C class method - m1()
* ((B)c).m1();    // B class method - m1()
* (A)((B)c).m1(); // A class method - m1()
*
* */

class ClassA4 {
    public static void m1() {
        System.out.println("A class method - m1()");
    }
}

class ClassB4 extends ClassA4{
    public static void m1() {
        System.out.println("B class method - m1()");
    }
}

class ClassC4 extends ClassB4{
    public static void m1() {
        System.out.println("C class method - m1()");
    }
}

public class MemberAccess4 {
    public static void main(String[] args) {

ClassC4 c=new ClassC4();
c.m1();

ClassB4 b=new ClassC4();
b.m1();

    }
}
