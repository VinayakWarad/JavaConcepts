package main.pkg2;

// Instead of creating new class and providing implementation for interface method
//we will create method(test() of AnonymousInnerClass) in class and provide implementation in it
//Later we will create obj of this class and access it in other class
//Note in other class it should be called by creating method in it.

interface Greet{
  public  void greet();

}
public class AnonymousInnerClass {

    //Lamda -> ALternative to Anonymous class
    //Greet g=()->System.out.println("This is anonymous inner class");

    //OR Anonymous
    public void test() {
        //Implementing the interface
        Greet g = new Greet() {
            @Override
            public void greet() {
                System.out.println("This is anonymous inner class");
            }
        };

        g.greet();
    }

    public static void main(String[] args){
        AnonymousInnerClass outerClass=new AnonymousInnerClass();
        outerClass.test();
    }
}

// Example 2 : Anonymous inner class for Runnable interface which contains only one method :
// void run();


class OuterClass {
    public void greet() {
        // Creating an anonymous inner class implementing Runnable
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from the anonymous inner class!");
            }
        };

        runnable.run();
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.greet();
    }
}

// Example 2 and 3 are same with diff logic

class RunnableExample {
    public static void main(String[] args) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running in a separate thread! anonymous class");
            }
        };

        Thread thread = new Thread(task);
        thread.start();  // This will call task.run() in a new thread
    }
}







