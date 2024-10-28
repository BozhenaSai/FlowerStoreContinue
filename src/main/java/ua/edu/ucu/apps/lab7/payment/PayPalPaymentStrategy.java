package ua.edu.ucu.apps.lab7.payment;

public class PayPalPaymentStrategy implements Payment{
    
        @Override
        public String pay(double price) {
            return "PayPal payment: " + price;
        }
}
