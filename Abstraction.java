package pkg2;

//Abstraction example

interface SuperInterface {
    public void test(); // COmmon methods
    public void test1(); // COmmon methods
}

//Step2 : Implement interface methods
class Test1 implements SuperInterface{
        public int lengthh(int a) {
        return 1;
    }

    @Override
    public void test() {

    }

    @Override
    public void test1() {

    }
}

public class Abstraction {
    public static void main(String[] args) {
SuperInterface si=new Test1(); // Create obj of impl class and store it in super interface ref variable
si.test(); // use super interface ref variable to access impl methods, SO user will not know it's impl
si.test1(); // but will be able to access methods / services

    }

}


