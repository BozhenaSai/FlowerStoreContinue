package ua.edu.ucu.apps.lab7.flower;

public class RibbonDecorator extends Item {
    @Override
    public double price() {
        return getPrice();
    }
    private Item item;

    public RibbonDecorator(Item item) {
        this.item = item;
    }

    @Override
    public double getPrice() {
        return item.getPrice() + 40;
    }

    @Override
    public String getDescription() {
        return item.getDescription() + " Item with ribbon decore.";
    }

}
