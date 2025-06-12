package main.casting;

abstract class Intf {
    static int x=10; // class.method
    int y=50;

     void test11(){
        //Impl - Concrete -> object of subclass
    }

    static void test13(){
        //Impl -> class.methodName
    }
    private void test14(){
        //impl this is inside class access only
    }
}

class Newclasss extends Intf{

}


class mainclass{
    public static void main(String[] args){
        Newclasss newclasss=new Newclasss();
        int h=newclasss.y;
        newclasss.test11();

        Intf.test13();//static
        int s=Intf.x;//datamember static
    }
}
