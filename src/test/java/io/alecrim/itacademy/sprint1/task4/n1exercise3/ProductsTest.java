package io.alecrim.itacademy.sprint1.task4.n1exercise3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductsTest {

    @Test
    void checkIndexOutOfBoundsThrowsError() {
        Products products = new Products();
        assertThrows(IndexOutOfBoundsException.class, () -> {
            products.getSpecificProduct(6);
        });
    }
}