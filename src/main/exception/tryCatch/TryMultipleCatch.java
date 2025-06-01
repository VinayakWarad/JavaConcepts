package main.exception.tryCatch;
// Exception must be caught in child to parent hierarchy as shown below
public class TryMultipleCatch {
public static void main(String[] args){
    try{int x=10/0;}
    catch (ArithmeticException e){
        e.printStackTrace();
    }
    catch (Exception e){
        e.printStackTrace();
    }
}
}
