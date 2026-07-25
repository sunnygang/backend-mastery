package com.backend.mastery.concepts.abstraction;

/**
 * Definition: Hide implementation, Show only essential features.
 * Abstraction does not mean impossible to view
 * It means: The user of the class doesn't need to know the implementation to use it.
 *
 * Suppose every payment system must have a pay() method.
 * Instead of telling every developer, "Please remember to create pay()"
 * Java lets you enforce it.
 * The abstract class says: "I don't know how you'll pay, but every payment must provide this behavior."
 */
public class AbstractMain {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sleep();
        animal.sound();
    }
}

abstract class Animal {
    abstract void sound();

    void sleep() {
        System.out.println("Sleeping");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Barking");
    }
}