package ua.edu.ucu.apps.lab7.flower;

public class Cactus extends Flower {
    public Cactus(double sepalLength, 
    FlowerColor color, double price, 
    FlowerType flowerType) {
        super(sepalLength, color, 
        price, flowerType);
    }
    public Cactus() {
        super();
    }

    @Override
    public double price() {
        return getPrice();
    }
    
}
