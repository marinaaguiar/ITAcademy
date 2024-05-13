package io.alecrim.itacademy.sprint1.task4.n1exercise3;

public class Products {
    public String[] allProducts = { "dress", "t-shirt", "pants", "shorts" };

    public String getSpecificProduct(int index) throws IndexOutOfBoundsException {
        try {
            System.out.println(allProducts[index]);
            return allProducts[index];
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + e.getMessage());
        }
    }
}
