package ua.edu.ucu.apps.lab7;


import ua.edu.ucu.apps.lab7.payment.CreditCardPaymentStrategy;
import ua.edu.ucu.apps.lab7.payment.PayPalPaymentStrategy;
import ua.edu.ucu.apps.lab7.payment.Payment;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaymentTest {

    @Test
    public void testPayPalPaymentMethod() {
        Payment payPalPayment = new PayPalPaymentStrategy();
        assertEquals("PayPal payment: 100.0", payPalPayment.pay(100.0), 
                     "Payment method should be 'Paid by PayPal'");
    }

    @Test
    public void testCreditCardPaymentMethod() {
        Payment creditCardPayment = new CreditCardPaymentStrategy();
        assertEquals("Credit card payment: 100.0", creditCardPayment.pay(100.0), 
                     "Payment method should be 'Paid by Credit Card'");
    }
}