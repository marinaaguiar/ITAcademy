package io.alecrim.itacademy.sprint1.task7.n1exercise1;

public class Worker {
    private String firstName;
    private String lastName;
    private double pricePerHour;

    public Worker(String firstName, String lastName, double pricePerHour) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pricePerHour = pricePerHour;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public double calculateSalary(double numberOfHoursWorked) {
        double salary = numberOfHoursWorked * pricePerHour;
        return salary;
    }
}
