package OnlineStore;

import java.util.ArrayList;

public class TestShop {
    public static void main(String[] args) {
        Customer alice = new Customer("Alice", 20000);

        // code for creating stores and products are ommitted
        Product product_phone = new Product("Phone", 7000);
        Product product_laptop = new Product("Laptop", 10000);
        Product product_mouse = new Product("Mouse", 100);
        Product product_table = new Product("Table", 300);

        product_laptop.setRating(4);
        product_laptop.setRating(5);

        product_table.setRating(5);
        product_table.setRating(4);
        product_table.setRating(4);

        product_mouse.setRating(3);

        product_phone.setRating(5);
        product_phone.setRating(4);

        ArrayList<Product> products1 = new ArrayList<>();
        products1.add(product_laptop);
        products1.add(product_table);

        ArrayList<Product> products2 = new ArrayList<>();
        products2.add(product_mouse);

        ArrayList<Product> products3 = new ArrayList<>();
        products3.add(product_phone);


        Store store1 = new Store("store1", products1, 0);
        Store store2 = new Store("store2", products2, 0);
        Store store3 = new Store("store3", products3, 0);

        alice.purchaseProduct(store1, product_laptop);
        alice.purchaseProduct(store1, product_table);
        alice.purchaseProduct(store2, product_mouse);
        alice.purchaseProduct(store3, product_phone);

        System.out.println("\nSort by purchaseTime");
        alice.viewShoppingCart(SortBy.PurchaseTime);

        System.out.println("\nSort by rating");
        alice.viewShoppingCart(SortBy.Rating);

        System.out.println("\nSort by price");
        alice.viewShoppingCart(SortBy.Price);
    }
}
