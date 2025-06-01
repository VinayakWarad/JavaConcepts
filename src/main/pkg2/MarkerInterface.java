package main.pkg2;

//✅ What is a Marker Interface in Java?
//A marker interface is an interface with no methods or fields — it's empty. It is used to mark or tag a class to give it special behavior or metadata.

/*when to use - If you have 10 docs out of which 6 are only important and you want to do action on these, now you have to implement
* those 6 class with marker interface and use instance of to perform specific action-*/

// Custom marker interface
interface Important { }

class MyClass implements Important {
    // no special method needed
}

 class MarkerTest {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        if (obj instanceof Important) {
            System.out.println("This object is marked as Important.");
        }
    }
}
