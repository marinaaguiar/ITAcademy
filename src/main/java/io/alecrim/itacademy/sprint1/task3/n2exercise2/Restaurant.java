package io.alecrim.itacademy.sprint1.task3.n2exercise2;

public class Restaurant {
    public String name;
    public double score;

    public Restaurant(String name, double score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj.getClass() == this.getClass())) {
            return false;
        }

        Restaurant restaurant = (Restaurant) obj;

        return this.name.equals(restaurant.name) && this.score == restaurant.score;
    }

    @Override
    public int hashCode() {
        String scoreString = Double.toString(score);
        return name.hashCode() * scoreString.hashCode();
    }
}
