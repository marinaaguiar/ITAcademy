package io.alecrim.itacademy.sprint1.task3.n2exercise2;

import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static Set<Restaurant> restaurants = new HashSet<>();

    public static void main(String[] args) {
        Restaurant mcDonalds1 = new Restaurant("McDonalds", 5);
        Restaurant mcDonalds2 = new Restaurant("McDonalds", 7);
        Restaurant mcDonalds3 = new Restaurant("McDonalds", 8);

        addRestaurantToList(mcDonalds1);
        addRestaurantToList(mcDonalds2);
        addRestaurantToList(mcDonalds3);

        for (Restaurant restaurant : restaurants) {
            System.out.println("Restaurant Name: " + restaurant.name + ", " + "Score: " + restaurant.score);
        }
        orderByNameAndScore();
    }

    public static void addRestaurantToList(Restaurant restaurant) {
        restaurants.add(restaurant);
    }

    public static void orderByNameAndScore() {
        List<Restaurant> orderedRestaurants = restaurants.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(orderedRestaurants);

        for (Restaurant restaurant : orderedRestaurants) {
            System.out.println("Restaurant Name: " + restaurant.name + ", " + "Score: " + restaurant.score);
        }
    }
}
