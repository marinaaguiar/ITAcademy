package io.alecrim.itacademy.sprint1.task2.n1exercise1;

public class Main {
    public static void main(String[] args) {
        Sale sale = new Sale();

        try {
            sale.calculateTotal();
        } catch (SaleEmptyException e) {
            System.out.println(e.getMessage());
        }

        sale.addProduct("T-shirt", 27.90);
        sale.addProduct("Dress", 39.90);
        sale.addProduct("Skirt", 34.50);

        try {
            sale.calculateTotal();
        } catch (SaleEmptyException e) {
            System.out.println(e.getMessage());
        }

        try {
            Product invalidProduct = sale.products.get(5);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds: " + e.getMessage());
        }
    }
}

