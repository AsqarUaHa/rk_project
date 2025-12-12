package model;

public class Main {
    public static void main(String[] args) {


    Category fruits = new Category("Fruits");
    Category snacks = new Category("Snacks");


    Product apple = new Product("Apple", 250, fruits);
    Product banana = new Product("Banana", 300, fruits);
    Product chips = new Product("Chips", 500, snacks);


    Cart cart = new Cart();
    cart.addProduct(apple);
    cart.addProduct(banana);
    cart.addProduct(chips);

    cart.showCart();
}
}
