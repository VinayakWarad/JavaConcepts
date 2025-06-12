package main.thisKeword;

public class ThisKeywordEx {
    int num1; //instance variable (global non static)
    int num2; //instance variable (global non static)
    public  ThisKeywordEx(int num1,int num2){  // num1 and num2 - local variables
        this.num1=num1; //this.num1 -> inst variable
        this.num2=num2;//this.num2 -> inst variable
    }
}

class Demo{
    public static void main(String args[]){
        ThisKeywordEx t=new ThisKeywordEx(4,5);
        }
}
