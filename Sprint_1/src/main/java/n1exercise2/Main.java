package n1exercise2;

import n1exercise2.Car;

public class Main {
    public static void main(String[] args) {

        // Setting a model for a new Car object
        Car smallCar = new Car("Picasso", 80);
        System.out.println("Brand: " + smallCar.brand + ", Model: " + smallCar.model + ", Power: " + smallCar.power);

        // Not initializing a Car class will result in modifying the 'model',
        // but the 'brand' attribute, which is final, will remain the same.
        System.out.println("Brand: " + Car.brand + ", Model: " + Car.model);

        // Setting a new model for a new Car object
        Car mediumCar = new Car("\nC5", 120);
        System.out.println("Brand: " + mediumCar.brand + ", Model: " + mediumCar.model + ", Power: " + mediumCar.power);

        /*
        As both 'brand' and 'power' are final attributes, it isn't possible to change their value.
        However, it's possible to change the value of 'model' variable as it is not final.
        */

        System.out.println("Brand: " + Car.brand + ", Model: " + Car.model);

        /*
        As both 'Model' and 'brand' are static attributes it isn't necessary to initialize
        the class Car to have access to it.
         */

        // Invoke a non-static method
        smallCar.accelerate();

        //Invoke a static method
        Car.breakCar();
    }
}

