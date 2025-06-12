package main.test;

import main.test.MyException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Testing {

    public void loadLocalization()  {
        try {
            // FileReader reader = new FileReader("localization.txt");
            // Simulate other code that might throw IOException
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            // Rethrow custom exception with your own message
                  throw new ArithmeticException("Localization could not be retrieved...");
            // } catch (FileNotFoundException e) {
            //   throw new MyException(e.getMessage());
            //}
        }
        finally {
            throw new NullPointerException("Null pointer exception");
        }
    }

    public static void main(String[] args) {
        Testing obj = new Testing();
        try {
            obj.loadLocalization();
        } catch (MyException e) {
            System.out.println("Custom exception caught: " + e.getMessage());
        }
    }
}
