package ua.edu.ucu.apps.lab7.flower;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;
import java.util.Collections;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FlowerPack {
    private Flower flower;
    private int quantity;

    public double getPrice() {
        return flower.getPrice() * quantity;
    }

    public List<Flower> getFlowers() {

        return Collections.nCopies(quantity, flower);

    }
}

