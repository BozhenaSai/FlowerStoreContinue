package ua.edu.ucu.apps.lab7;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.lab7.delivery.DHLDeliveryStrategy;
import ua.edu.ucu.apps.lab7.delivery.Delivery;
import ua.edu.ucu.apps.lab7.delivery.PostDeliveryStrategy;





public class DeliveryTest {

    private Delivery dhlDelivery;
    private Delivery postDelivery;

    @BeforeEach
    public void setUp() {
        dhlDelivery = new DHLDeliveryStrategy();
        postDelivery = new PostDeliveryStrategy();
    }

    @Test
    public void testDHLDelivery() {
        double price = 100.0;
        String expected = "DHL delivery costs: 100.0";
        String actual = dhlDelivery.delivery(price);
        assertEquals(expected, actual);
    }

    @Test
    public void testPostDelivery() {
        double price = 50.0;
        String expected = "Post delivery cost: 50.0";
        String actual = postDelivery.delivery(price);
        assertEquals(expected, actual);
    }

    @Test
    public void testDHLDeliveryWithZeroPrice() {
        double price = 0.0;
        String expected = "DHL delivery costs: 0.0";
        String actual = dhlDelivery.delivery(price);
        assertEquals(expected, actual);
    }

    @Test
    public void testPostDeliveryWithZeroPrice() {
        double price = 0.0;
        String expected = "Post delivery cost: 0.0";
        String actual = postDelivery.delivery(price);
        assertEquals(expected, actual);
    }

    @Test
    public void testDHLDeliveryWithNegativePrice() {
        double price = -10.0;
        String expected = "DHL delivery costs: -10.0";
        String actual = dhlDelivery.delivery(price);
        assertEquals(expected, actual);
    }

    @Test
    public void testPostDeliveryWithNegativePrice() {
        double price = -20.0;
        String expected = "Post delivery cost: -20.0";
        String actual = postDelivery.delivery(price);
        assertEquals(expected, actual);
    }
}
