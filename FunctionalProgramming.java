package pkg2;

//Passing function as a parameter to method - Functional programming
//THis example is also example of Polymorphism
interface Shape{
    public void drawShape();}

class ShapeDrawer {
    public static void drawShape(Shape reference) { //Passed method as argument
        reference.drawShape();
    }
}
public class FunctionalProgramming {
    public static void main(String args[]){
        Shape ref=()->{System.out.println("round shape");};
        Shape ref2=()->{System.out.println("Square shape");}; // function logic that can be passed as arg
        ShapeDrawer.drawShape(ref2);
        ShapeDrawer.drawShape(ref);
    }

}
