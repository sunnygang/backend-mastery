package com.backend.mastery.concepts.inheritance;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Inheritance allows one class to reuse another class's properties and methods.
 */
public class InheritanceMain {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();
    }
}

class Animal {
    private static final Logger log = LoggerFactory.getLogger(Animal.class);
    void eat() {
        log.info("Eating..");
    }
}

class Dog extends Animal {
    private static final Logger log = LoggerFactory.getLogger(Dog.class);
    private String color;
    public void setColor(String colorInput) {
        color = colorInput;
    }
    public String getColor() {
        return color;
    }
    @Override
    void eat() {
        log.info("Dog eating...");
    }
    void bark() {
        log.info("Barking...");
    }
}

class Lion extends Animal {
    private static final Logger log = LoggerFactory.getLogger(Lion.class);
    void hunting() {
        log.info("Hunting...");
    }
}
