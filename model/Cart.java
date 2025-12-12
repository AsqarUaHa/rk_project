package model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }


    public double getTotalPrice() {
        double sum = 0;
        for (Product p : products) {
            sum += p.getPrice();
        }
        return sum;
    }

    public void showCart() {
        System.out.println("=== Cart Contents ===");
        for (Product p : products) {
            System.out.println(p);
        }
        System.out.println("Total: " + getTotalPrice() + "₸");
    }
}

