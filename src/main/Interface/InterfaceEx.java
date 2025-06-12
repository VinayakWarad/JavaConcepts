package main.Interface;


    public class InterfaceEx {
        public static void main(String[] args) throws Exception {
            NewClass n=new NewClass();
            n.m1();
            n.m3();
        }
    }

    interface MyInterface1 extends MyInterface2, MyInterface3 {
        int x=10;
        public void m1();
    }

    interface MyInterface2 {

        default void m2() {
            System.out.println("Inteface 2");
        }
    }

    interface MyInterface3 {

        default void m3() {
            System.out.println("super method executed");
        }
    }

    class NewClass implements MyInterface1 {

        @Override
        public void m1() {
            System.out.println("only main class inteface method can be overridden");
        }
    }




