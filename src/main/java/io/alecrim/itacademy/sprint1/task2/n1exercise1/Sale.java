package io.alecrim.itacademy.sprint1.task2.n1exercise1;

import java.util.List;
import java.util.ArrayList;

public class Sale {
    public List<Product> products;
    public double totalSalePrice;

    public Sale() {
        products = new ArrayList<>();
        totalSalePrice = 0.0;
    }

    public void addProduct(String productName, double productPrice) {
        Product product = new Product(productName, productPrice);
        products.add(product);
        System.out.println("Added product: " + product.name);
    }

    public void calculateTotal() throws SaleEmptyException {
        if (products.isEmpty()) {
            throw new SaleEmptyException();
        }

        totalSalePrice = 0.0;
        for (Product product : products) {
            totalSalePrice += product.price;
        }

        System.out.println("Your total amount of product is: " + products.stream().count());
        System.out.println("Your total sale price is: €" + totalSalePrice);
    }
}
