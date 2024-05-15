package io.alecrim.itacademy.sprint1.task6.n1exercise2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Marina", "Aguiar Alecrim", 28);
        GenericMethods.getPersonInfo(person.getFirstName(), person.getLastName(), person.getAge());
        GenericMethods.getPersonInfo(person.getLastName(), person.getAge(), person.getFirstName());
    }
}
