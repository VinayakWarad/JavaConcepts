package main.singleton;

/*Approach 1 : Eager initialization*/
public class SingletonEx {
/*Step 1 :  Create obj of class and make it private static*/
    private static SingletonEx singletonEx=new SingletonEx();

/* Step 2 : Make COnstructor private*/
    private SingletonEx(){}

/* Step 3 : Expose static method that returns same object always*/
    public static SingletonEx getInstance(){
        return singletonEx;
    }
}

class CallingClass{
    SingletonEx s=SingletonEx.getInstance();
}

/*
Approach 2 : Lazy Initialization*/
/*If multiple threads comes to this class parallely 1st time then there might be chances of
creating multiple objects*/
class SingletonEx2 {
    /*Step 1 :  Create obj of class and make it private static*/
    private static SingletonEx2 singletonEx2;

    /* Step 2 : Make COnstructor private*/
    private SingletonEx2(){}

    /* Step 3 : Expose static method that returns same object always*/
    public static SingletonEx2 getInstance(){
        if (singletonEx2==null){
            singletonEx2=new SingletonEx2();
        }
        return singletonEx2;
    }
}

class CallingClass2{
    SingletonEx2 s=SingletonEx2.getInstance();
}

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