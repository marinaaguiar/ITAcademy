package io.alecrim.itacademy.sprint1.task7.n1exercise1;

public class OnlineWorker extends Worker {
    private final double internetCost;

    public OnlineWorker(String firstName, String lastName, double pricePerHour, double internetRate) {
        super(firstName, lastName, pricePerHour);
        this.internetCost = internetRate;
    }

    public double getInternetCost() {
        return internetCost;
    }

    @Override
    public double calculateSalary(double numberOfHoursWorked) {
        double salary = (numberOfHoursWorked * getPricePerHour()) + internetCost;
        return salary;
    }
}