package com.backend.mastery.concepts.polymorphism.methodoverriding;

public class OverRidingPolymorphismMain {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();
        animal = new Dog();
        animal.sound();
    }
}

class Animal {
    void sound() {
        System.out.println("Animal Sound...");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barking...");
    }
}
