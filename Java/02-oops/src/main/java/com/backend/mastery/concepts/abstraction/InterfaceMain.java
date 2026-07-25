package com.backend.mastery.concepts.abstraction;

public class InterfaceMain {
    public static void main(String[] args) {

    }
}

interface Payment {
    void pay();

    default void receipt() {
        System.out.println("Take receipt");
    }
}

class CreditCardPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Pay via Credit card payment");
    }
}

class UpiPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Pay via UPI payment");
    }
}
