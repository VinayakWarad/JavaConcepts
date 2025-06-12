package main.casting;

// downcasting example - usinf instance of is best pratice before downcasting
    class Animal {
        void makeSound() {
            System.out.println("Some generic animal sound");
        }
    }

    class Dog extends Animal {
        void bark() {
            System.out.println("Dog is barking");
        }

        @Override
        void makeSound() {
            System.out.println("Woof!");
        }
    }

    public class casting1 {
        public static void main(String[] args) {
            Animal myAnimal = new Dog();  // Superclass reference to subclass object

            // Check if myAnimal is an instance of Dog
            if (myAnimal instanceof Dog) {
                System.out.println("myAnimal is an instance of Dog");

                // Downcast to Dog
                Dog myDog = (Dog) myAnimal;
                myDog.bark();  // Now you can call Dog-specific methods
            }

            myAnimal.makeSound();  // Calls Dog's overridden method due to polymorphism
        }
    }


