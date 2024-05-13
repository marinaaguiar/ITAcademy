package io.alecrim.itacademy.sprint1.task4.n1exercise3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


class ProductsTest {

    @ParameterizedTest
    @ValueSource(ints = {-1, 4, 6})

    void checkIndexOutOfBoundsThrowsError(int index) {
        Products products = new Products();

        IndexOutOfBoundsException exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            products.getSpecificProduct(index);
        });

        String expectedMessage = "Index out of bounds: Index " + index + " out of bounds for length " + products.allProducts.length;
        String actualMessage = exception.getMessage();

        System.out.println("Expected exception message to contain: " + expectedMessage + ", but got: " + actualMessage);
        assertTrue(actualMessage.contains(expectedMessage), "Expected exception message to contain: " + expectedMessage + ", but got: " + actualMessage);
    }
}