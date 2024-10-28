package ua.edu.ucu.apps.lab7.flower;

public class Romashka extends Flower {
    public Romashka(double sepalLength, 
    FlowerColor color, double price, 
    FlowerType flowerType) {
        super(sepalLength, color, 
        price, flowerType);
    }
    public Romashka() {
        super();
    }
 
    @Override
    public double price() {
        return getPrice();
    }
    
}
