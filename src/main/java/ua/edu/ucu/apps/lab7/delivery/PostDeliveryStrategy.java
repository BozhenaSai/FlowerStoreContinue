package ua.edu.ucu.apps.lab7.delivery;

public class PostDeliveryStrategy implements Delivery {

    @Override
    public String delivery(double price) {
        return "Post delivery cost: " + price;
    }
}