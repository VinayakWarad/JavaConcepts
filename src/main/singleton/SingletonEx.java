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
