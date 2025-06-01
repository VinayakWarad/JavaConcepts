package main.exception;

//Example of throw
public class CustomExceptionThrow extends RuntimeException{

/**
     * Common exception that should be the parent of all runtime exceptions within
     * the C360 applications.
     *
     */


        public CustomExceptionThrow() {
            super();
        }

        public CustomExceptionThrow(String message, Throwable cause) {
            super(message, cause);
        }

        public CustomExceptionThrow(String message) {
            super(message);
        }

        public CustomExceptionThrow(Throwable cause) {
            super(cause);
        }

/* Below is for Kafka event exception throwing
 //ErrorEventInfo -> decorated event that we are trying to produce
    public CustomExceptionThrow(String message, Throwable cause, ErrorEventInfo errorEventInfo) {
        super(message, cause);
        this.errorEventInfo = errorEventInfo;
    }*/

}

class DisplayServices {
    public static void main(String[] args) {
        int x = 10;
        int y = 12;
        MyClass1 myClass1=new MyClass1();
        myClass1.test(x,y);

 }
}



class MyClass1 {
    public int test(int x, int y) {
        if (x == y) {
            return 1;
        } else if (x == 90) {
            return 2;
        } else {
            System.out.println("entered2");
            throw new CustomExceptionThrow("Localization could not be retrieved...");
        }

    }
}


