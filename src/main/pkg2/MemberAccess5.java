package main.pkg2;

/* variable reservation is always based on reference type but not based on runtime object
* Fields are hidden, not overridden.
* To access superclass variables, you need to cast the object.
* */
class ClassA5 {
    int x = 777;
}

class ClassB5 extends ClassA5 {
    int x = 888;
}

class ClassC5 extends ClassB5 {
    int x = 999;
}

public class MemberAccess5 {
    public static void main(String args[]) {
        ClassC5 c5 = new ClassC5();

        // Access x directly
        System.out.println("x from ClassC5: " + c5.x);  // 999

        // Access x from ClassB5 by casting
        System.out.println("x from ClassB5: " + ((ClassB5)c5).x);  // 888

        // Access x from ClassA5 by casting
        System.out.println("x from ClassA5: " + ((ClassA5)c5).x);  // 777
    }
}
