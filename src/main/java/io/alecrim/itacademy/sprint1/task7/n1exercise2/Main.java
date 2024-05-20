package io.alecrim.itacademy.sprint1.task7.n1exercise2;

@SuppressWarnings("deprecation")
public class Main {

    public static void main(String[] args) {
        Worker worker = new Worker("Emma", "Watson", 20.0);
        OnsiteWorker onsiteWorker = new OnsiteWorker("Matt", "Dressner", 20.0, 250.0);
        OnlineWorker onlineWorker = new OnlineWorker("Gracy", "Adams", 20.0, 120.0);

        double hoursWorked = 40;

        System.out.println("Worker's Salary: €" + worker.calculateSalary(hoursWorked));
        System.out.println("Onsite Worker's Salary: €" + onsiteWorker.calculateSalary(hoursWorked));
        System.out.println("Online Worker's Salary: €" + onlineWorker.calculateSalary(hoursWorked));

        onlineWorker.equipmentCosts();
        onsiteWorker.extraCommuteCost();
    }

}
