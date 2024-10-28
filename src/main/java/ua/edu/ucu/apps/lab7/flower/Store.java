package ua.edu.ucu.apps.lab7.flower;
import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<FlowerBucket> flowerBuckets;

    public Store() {
        this.flowerBuckets = new ArrayList<>();
    }

    public void addFlowerBucket(FlowerBucket bucket) {
        flowerBuckets.add(bucket);
    }

    public List<FlowerPack> searchByType(FlowerType flowerType) {
        List<FlowerPack> foundFlowerPacks = new ArrayList<>();
        
        for (FlowerBucket bucket : flowerBuckets) {
            for (FlowerPack pack : bucket.getFlowerPacks()) {
                if (pack.getFlower().getFlowerType().equals(flowerType)) {
                    foundFlowerPacks.add(pack);
                }
            }
        }

        return foundFlowerPacks;
    }
}
