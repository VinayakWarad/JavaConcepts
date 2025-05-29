package main.pkg2;
/*Inheritance is mandatory here
* COnstructor can't be static
* COnstructor can't be inherited * COnstructor has same name as that of class
* If you write return type for constructor it will be considered as normal method
* Constructors are used to initialise datamembers of class
* If class contains default / zero arg constructor then datamembers will have defaulr values
*
* */
class SuperCls{
    public SuperCls(){
        this(10);// Calling one constructor from other constructor using this keyword
        System.out.println("SuperCls constructor");
    }
    public SuperCls(int x){
        System.out.println("SuperCls constructor with args");
    }
}

class SubCls{
    public SubCls() {
        super(); // Whenever object of this class is created default SuperCls constructor executes 1st then below code
        System.out.println("SubCls constructor");
    }
}

public class ConstructorSuperThisKeyword {
    SubCls s=new SubCls();
}
