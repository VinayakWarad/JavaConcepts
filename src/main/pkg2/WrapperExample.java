package main.pkg2;
import java.util.*;
import java.util.function.Predicate;

import java.util.ArrayList;
//Example 1 :
//Autoboxing and Unboxing
public class WrapperExample {
    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<>();

        numbers.add(5.9);   // Autoboxing: int → Integer
        numbers.add(10.3);
System.out.println(ArrayList.class.arrayType());
        double sum = numbers.get(0) + numbers.get(1);  // Unboxing: Integer → int
        System.out.println("Sum: " + sum);  // Output: Sum: 15
    }

}

//Example 2
class FunctionalWrapperExample {
    public void main() {
        List<Integer> numbers = Arrays.asList(10, 25, 30, 45, 50);

        // Predicate is a functional interface that takes an object (Integer) and returns a boolean
        Predicate<Integer> isEven = n -> n % 2 == 0;

        // Using the Predicate with Stream API
        numbers.stream()
                .filter(isEven)  // Autoboxing happens here
                .forEach(System.out::println);
    }
}

//Example 3 :
 class WrapperExample3 {
    public void Boxing(){
Integer i=Integer.valueOf(20); // Explicit boxing
Integer i2=i; //  // Simple reference copy; no boxing or unboxing occurs here

int a1=i.intValue(); // Unboxing
int pi=a1; // Autounboxing

    }

}






