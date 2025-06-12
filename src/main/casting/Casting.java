package main.casting;

// As m1() method is static output is as shown below else it will be CCC
//Example of method hiding

class A {
     int x=777;
   static void m1() {
        System.out.println("A");
    }
}

class B extends A {
     int x=888;
    static void m1() {
        System.out.println("B");
    }
}

     class C extends B {
           int x=999;
       static void m1() {
            System.out.println("C");
        }

    }

public class Casting {
        public static void main(String[] args) {
 C c=new C();
 c.m1();// o/p -> C
System.out.println(c.x); //999

 B b=(B)c;
 b.m1(); // o/p -> B
System.out.println(b.x); //888

 A a=(A) b;
 a.m1();// o/p -> A
System.out.println(a.x); //777
        }
    }

