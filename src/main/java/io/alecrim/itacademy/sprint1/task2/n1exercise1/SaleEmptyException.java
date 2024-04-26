package io.alecrim.itacademy.sprint1.task2.n1exercise1;

public class SaleEmptyException extends Exception {
    public SaleEmptyException() {
        super("To make a sale you must first add products");
    }
}
