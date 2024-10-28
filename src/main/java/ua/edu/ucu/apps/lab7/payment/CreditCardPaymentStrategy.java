package ua.edu.ucu.apps.lab7.payment;

public class CreditCardPaymentStrategy implements Payment {

    @Override
    public String pay(double price) {
        return "Credit card payment: " + price;
    }
    
}
