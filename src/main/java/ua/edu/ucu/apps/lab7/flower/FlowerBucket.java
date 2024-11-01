package ua.edu.ucu.apps.lab7.flower;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class FlowerBucket {
    private List<FlowerPack> flowerPacks;

    public FlowerBucket() {
        flowerPacks = new ArrayList<>();
    }

    public void addFlowers(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack : flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }

    public boolean searchFlower(Flower flower){
        for (FlowerPack flowerPack : flowerPacks) {
            for (Flower current : flowerPack.getFlowers()) {
                if (current.equals(flower)) {
                    return true;
                }
            }
        }
        return false;
    }
}
