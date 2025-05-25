package main.pkg2;


class Superclass {
    private int x = 10;
    public int getX() {return x; }
    public void setX(int x) {this.x = x;}

    private void privateMethod() {
        System.out.println("Private method sup can't be inherited to sub class");
    }
}

class SubClass extends Superclass {
}

public class MemberAccess {
    public static void main(String[] args) {
//Example 1 : Can we access private data members of superclass in subclss directly(NO) - But there is one approach (Example 2)
        SubClass s = new SubClass();
// s.x(); Is not possible

//Example 2 : what is approach to access private data members of superclass in subclss
// We can access then by getter and setter methods for that datamembers in class and access it - Encapsulation
        int val = s.getX();
        System.out.println(val);

//Example 3
// Note : Can private method superClass be inherited to subclass (No)

    }
}
