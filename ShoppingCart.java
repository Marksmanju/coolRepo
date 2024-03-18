package org.example;

import java.util.HashMap;
import java.util.HashSet;

public class ShoppingCart {
    private HashMap<Product,Integer> items;

    public ShoppingCart(HashMap<Product, Integer> items) {
        this.items = items;
    }

    public ShoppingCart() {
        this.items = new HashMap<>();
    }

    public void addItem(Product product, int quantity) {
        if(quantity <= 0){
            throw new IllegalArgumentException();
        }
        this.items.put(product,quantity);
    }

    public void removeItem(Product product) {
        items.remove(product);
    }

    public double getTotalPrice()
    {
        double total = 0;
        for (HashMap.Entry<Product, Integer> item : items.entrySet())
        {
            if (item.getValue() > 0) {
                total += item.getKey().getPrice() * item.getValue();
            }
            else
            {
                throw new IllegalArgumentException();
            }
        }
        return total;
    }
}