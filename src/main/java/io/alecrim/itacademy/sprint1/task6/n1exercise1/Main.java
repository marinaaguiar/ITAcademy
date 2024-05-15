package io.alecrim.itacademy.sprint1.task6.n1exercise1;

public class Main {

    public static void main(String[] args) {
        try {
            NoGenericMethods product = new NoGenericMethods("Dress", "On Sale", "Summer");
            System.out.println(product.getName() + ", " + product.getStatus() + ", " + product.getSeason());

            NoGenericMethods product1 = new NoGenericMethods("On Sale", "Summer", "name");
            System.out.println(product.getName() + ", " + product.getStatus() + ", " + product.getSeason());

            product.setProductCharacteristics("Skirt", "Out of Stock", "Spring");
            System.out.println(product.getName() + ", " + product.getStatus() + ", " + product.getSeason());

            product.setProductCharacteristics("", "On Inventory", "Winter");
            System.out.println(product.getName() + ", " + product.getStatus() + ", " + product.getSeason());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
