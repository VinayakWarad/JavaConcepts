package pkg2;

// Example of bank - * add balance by entering amount  * get balance by entering password

class Account{
    private int pin=1234;
    private  double balance;

    public void setBalance(double amt){
        if (amt>0){
            balance=balance+amt;
        }
    }

    public double getBalance(int pinUser){
        if (pinUser==pin){
            return balance;
        }
        else {
            return -777;
        }
    }

}

public class Encapsulation1 {
    public static void main(String args[]){
        Account account=new Account();
        account.setBalance(200.0);
        account.getBalance(1234);

    }
}
