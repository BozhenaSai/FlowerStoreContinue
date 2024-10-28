package ua.edu.ucu.apps.lab7.flower;

public class BasketDecorator extends Item {
    @Override
    public double price() {
        return getPrice();
    }
    private Item item;

    public BasketDecorator(Item item) {
        this.item = item;
    }

    @Override
    public double getPrice() {
        return item.getPrice() + 4;
    }

    @Override
    public String getDescription() {
        return item.getDescription() + " Item with basket decore.";
    }

}
