package main.pkg2;
// If one class is extending other class - Child method have same static method as parent then it's called
//Method hiding

//Note : If methods are with same name and are non static then it's called Overriding

//In Method hiding o/p based on reference type
//In overriding o/p is based on runtime object
class MethodHiding1{
    public static void m1(){
        System.out.println("Static method of MethodHiding1");
    }
}

class MethodHiding2 extends MethodHiding1{
    public static void m1(){
        System.out.println("Static method of MethodHiding2");
    }
}

public class MethodHiding {
MethodHiding1 methodHiding1=new MethodHiding1();
MethodHiding2 methodHiding2=new MethodHiding2();
MethodHiding1 method1=new MethodHiding2();

//methodHiding1.m1(); -> Static method of MethodHiding1
//methodHiding2.m2(); ->Static method of MethodHiding2
//method1.m1(); -> Static method of MethodHiding1
}
