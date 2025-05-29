package main.pkg2;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*A lambda expression is a short block of code that takes in parameters and returns a value
— just like a method — but without having to declare a class or method name.

Lambdas are mainly used to implement functional interfaces
(interfaces with exactly one abstract method).

Functional Interfaces like Runnable, Comparator, Consumer, etc.

ex :
(int a, int b) -> { return a + b; }
(a, b) -> a + b

Streams API: ex
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
names.forEach(name -> System.out.println(name));

*/


@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}
    public class LamdaExpressions {
        public static void main(String[] args) {
            MathOperation add = (a, b) -> a + b;
            MathOperation mul = (a, b) -> a * b;

            System.out.println("Sum: " + add.operate(10, 20));   // Output: 30
            System.out.println("Product: " + mul.operate(10, 20)); // Output: 200
        }
    }

//Example 2 :
 class myClass {
    public static void main(String[] args) {
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(4));  // true
    }
}

//Example3 : To upeercase


class ConvertInStrToUpperCaseAndPrint {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("STr", "ksd");
        // Print each string in uppercase
        list.forEach(a -> System.out.println(a.toUpperCase()));
    }
}

//Example 4 : Implement a Comparator using a
// lambda expression to sort a list of integers in descending order.
class DescendingSortExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 9);

        // Sort in descending order using a lambda comparator
        numbers.sort((a, b) -> b - a);

        System.out.println(numbers);  // Output: [9, 8, 5, 3, 1]

// OR Approach 2
//You can also use the built-in comparator for descending order:
        numbers.sort(Comparator.reverseOrder());
    }
}

//Example 5 :
//COmpare age if same then compare name :
//Using the Comparator interface methods
//Comparator.comparing(Function keyExtractor) — creates a comparator using a key (e.g., field)
//thenComparing — to chain comparators for tie-breakers
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " (" + age + ")";
    }
}

 class Demo {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 30),
                new Person("David", 25)
        );

        people.sort(Comparator.comparingInt((Person p) -> p.age)
                .thenComparing(p -> p.name));

        System.out.println(people);
        // Output: [Bob (25), David (25), Alice (30), Charlie (30)]
    }
}

//Example 5 : Write a lambda that takes a string and returns its length.
// Use it to find the length of a list of strings

class  PrintStrLenUsingFunInterface{
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "fig");

        // Define the function (lambda) that returns the length of a string
        Function<String, Integer> lengthFunc = s -> s.length();

        // Use forEach to print the lengths by applying the function
        strings.forEach(s -> System.out.println(lengthFunc.apply(s)));
    }
}

//Example 9 :To filter out all even numbers from a list of integers
// using a lambda expression with the Predicate interface,

class EvenNumberFilter {
    public static void main(String[] args) {
        // List of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Predicate to test if a number is even
        Predicate<Integer> isEven = n -> n % 2 == 0;

        // Filter out even numbers using the Predicate
        List<Integer> oddNumbers = numbers.stream()
                .filter(isEven.negate())  // Negate the isEven predicate to filter out even numbers
                .collect(Collectors.toList());

        // Print the filtered list (only odd numbers)
        System.out.println(oddNumbers);  // Output: [1, 3, 5, 7, 9]
    }
}







