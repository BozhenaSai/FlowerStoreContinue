package ua.edu.ucu.apps.lab7.flower;

public class PaperDecorator extends Item {
    @Override
    public double price() {
        return getPrice();
    }
    private Item item;

    public PaperDecorator(Item item) {
        this.item = item;
    }

    @Override
    public double getPrice() {
        return item.getPrice() + 13;
    }

    @Override
    public String getDescription() {
        return item.getDescription() + " Item with paper decore.";
    }

}
