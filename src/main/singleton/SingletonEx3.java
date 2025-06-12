package main.singleton;


/*
Approach 3 : Synchronized */
/*Above issue is solved here - But not performance effective as one thread can be getting 1 inst at a time*/
class SingletonEx3 {
    /*Step 1 :  Create obj of class and make it private static*/
    private static SingletonEx3 singletonEx3;

    /* Step 2 : Make COnstructor private*/
    private SingletonEx3(){}

    /* Step 3 : Expose static method that returns same object always*/
    synchronized public static SingletonEx3 getInstance(){
        if (singletonEx3==null){
            singletonEx3=new SingletonEx3();
        }
        return singletonEx3;
    }
}

class CallingClass3{
    SingletonEx2 s=SingletonEx2.getInstance();
}