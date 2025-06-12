package main.singleton;


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

