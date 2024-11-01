package ua.edu.ucu.apps.lab7.flower;
import lombok.Getter;

@Getter
public enum FlowerColor {
    
    RED("#FF0000"), BLUE("#0000FF");
    private final String stringRepresentation;

    FlowerColor(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }
}
