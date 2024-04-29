package io.alecrim.itacademy.sprint1.task2.n2exercise1;
import java.util.InputMismatchException;

public class UserInfo {
    Input input = new Input();
    byte age;
    int yearOfBirth;
    float gpa;
    double expectedSalary;

    public void run() {
        getUserAge();
        getUserYearOfBirth();
        getUserGPA();
        getUserExpectedSalary();

        printAllUserInfo();
    }

    public void getUserAge() {
        try {
            age = Input.readByte("Please enter your age: ");
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            getUserAge();
        }
    }

    public void getUserYearOfBirth() {
        try {
            yearOfBirth = Input.readInt("Please enter your year of birth: ");
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            getUserYearOfBirth();
        }
    }

    public void getUserGPA() {
        try {
            gpa = Input.readFloat("Please enter your gpa: ");
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            getUserGPA();
        }
    }

    public void getUserExpectedSalary() {
        try {
            expectedSalary = Input.readDouble("Please enter your expected salary: ");
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            getUserExpectedSalary();
        }
    }

    public void printAllUserInfo() {
        System.out.println("Age: " + age);
        System.out.println("Year of Birth: " + yearOfBirth);
        System.out.println("GPA: " + gpa);
        System.out.println("Expected salary: " + expectedSalary);
    }
}
