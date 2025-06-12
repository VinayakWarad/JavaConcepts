package main.casting;

    public class downcasting {
        public static void main(String[] args) throws Exception {
            Sup1 s = new Sub1(); // or new Sup1()

            if (s instanceof Sub1) {
                Sub1 sub = (Sub1) s;
                sub.subMethod();
            } else {
                System.out.println("s is NOT an instance of Sub1");
            }
        }
    }

    class Sup1 {
        public void superMethod() {
            System.out.println("super method executed");
        }
    }

    class Sub1 extends Sup1 {
        public void subMethod() {
            System.out.println("sub method executed");
        }
    }


