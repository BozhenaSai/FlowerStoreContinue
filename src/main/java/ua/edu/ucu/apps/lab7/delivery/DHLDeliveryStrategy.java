package ua.edu.ucu.apps.lab7.delivery;
public class DHLDeliveryStrategy implements Delivery {

    @Override
    public String delivery(double price) {
        return "DHL delivery costs: " + price;
    }
}