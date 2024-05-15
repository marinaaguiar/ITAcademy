package io.alecrim.itacademy.sprint1.task6.n1exercise1;

public enum ProductStatus {
    OUTOFSTOCK, ONSALE, ONINVENTORY;

    public String getName() {
        switch (this) {
            case OUTOFSTOCK:
                return "Out Of Stock";
            case ONSALE:
                return "On Sale";
            case ONINVENTORY:
                return "On Inventory";
            default:
                return "Unknown";
        }
    }
}
