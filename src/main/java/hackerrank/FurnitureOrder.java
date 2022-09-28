package hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */

    private HashMap<Furniture, Integer> furnitureOrders;

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
        // TODO: Complete the constructor
        furnitureOrders = new HashMap<>();
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        // TODO: Complete the method
        furnitureOrders.put(type, furnitureCount);
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        // TODO: Complete the method
        return furnitureOrders;
    }

    public float getTotalOrderCost() {
        // TODO: Complete the method
        Float cost = 0F;
        for (Map.Entry<Furniture, Integer> pair : furnitureOrders.entrySet()) {
            cost += pair.getValue() * pair.getKey().cost();
        }
        return cost;
    }

    public int getTypeCount(Furniture type) {
        // TODO: Complete the method
        return furnitureOrders.get(type) != null ? furnitureOrders.get(type).intValue() : 0;
    }

    public float getTypeCost(Furniture type) {
        // TODO: Complete the method
        return furnitureOrders.get(type) != null ? furnitureOrders.get(type) * type.cost() : 0;
    }

    public int getTotalOrderQuantity() {
        // TODO: Complete the method
        return furnitureOrders.values().stream().reduce(0, Integer::sum);
    }
}