package io.alecrim.itacademy.sprint1.task3.n2exercise1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    static Set<Restaurant> restaurants = new HashSet<>();

    public static void main(String[] args) {
        Restaurant mcDonalds1 = new Restaurant("McDonalds", 3.0);
        Restaurant mcDonalds2 = new Restaurant("McDonalds", 5.0);
        Restaurant mcDonalds3 = new Restaurant("McDonalds", 5.0);

        addRestaurantToList(mcDonalds1);
        addRestaurantToList(mcDonalds1);
        addRestaurantToList(mcDonalds2);
        addRestaurantToList(mcDonalds3);

        for (Restaurant restaurant : restaurants) {
            System.out.println("Restaurant Name: " + restaurant.name + ", " + "Score: " + restaurant.score);
        }
    }

    public static void addRestaurantToList(Restaurant restaurant) {
        restaurants.add(restaurant);
    }
}
