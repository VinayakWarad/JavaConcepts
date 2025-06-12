package main.casting;

public class Upcasting {
       public static void main(String[] args) throws Exception {
            Sup s=new Sub(); // Upcasting - Assigning a subclass object to a superclass reference
        }
    }

    class Sup {
        public void superMethod() {
            System.out.println("super method executed");
        }
    }

    class Sub extends Sup {
        public void subMethod() {
            System.out.println("sub method executed");
        }
    }

