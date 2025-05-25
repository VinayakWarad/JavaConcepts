package pkg2;
//Encapsulation
// 2 steps
class Test{
    private int x=10;  // Step 1 : making data members private

    public int getX() {
        return x;    }

    public void setX(int x) {
        this.x = x;    }
}

public class Encapsulation {
    public static void main(String args[]){
        //Step 2 :
        Test test=new Test(); // Creating object
        test.getX(); // accessing private members of class

    }
}
