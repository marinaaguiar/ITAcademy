package io.alecrim.itacademy.sprint1.task6.n1exercise1;

public class NoGenericMethods {
    private String name;
    private String status;
    private String season;

    public NoGenericMethods(String name, String status, String season) {
        if (name == null || name.isEmpty() || status == null || status.isEmpty() || season == null || season.isEmpty()) {
            throw new IllegalArgumentException("Name, status, and season cannot be null or empty");
        }

        this.name = name;
        this.status = status;
        this.season = season;
    }

    public void setProductCharacteristics(String name, String status, String season) {
        if (name == null || name.isEmpty() || status == null || status.isEmpty() || season == null || season.isEmpty()) {
            throw new IllegalArgumentException("Name, status, and season cannot be null or empty");
        }

        this.name = name;
        this.status = status;
        this.season = season;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public String getSeason() {
        return season;
    }
}
