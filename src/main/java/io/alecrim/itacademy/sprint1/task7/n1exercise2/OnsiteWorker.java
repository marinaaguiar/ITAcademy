package io.alecrim.itacademy.sprint1.task7.n1exercise2;

public class OnsiteWorker extends Worker {
    private final double gasCost;

    public OnsiteWorker(String firstName, String lastName, double pricePerHour, double gasCost) {
        super(firstName, lastName, pricePerHour);
        this.gasCost = gasCost;
    }

    @Override
    public double calculateSalary(double numberOfHoursWorked) {
        double salary = (numberOfHoursWorked * getPricePerHour()) + gasCost;
        return salary;
    }

    @Deprecated
    public void extraCommuteCost(){
        System.out.println("There is no extra commute costs being paid.");
    }
}
