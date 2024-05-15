package io.alecrim.itacademy.sprint1.task6.n2exercise1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Marina", "Aguiar Alecrim", 28);
        GenericMethods.getPersonInfo(person.getFirstName(), person.getLastName(), person.getAge());

        /*
        In this case, when we have a different attribute in a gereneric method that is not generic type
        we receive the following error:
        'incompatible types: String cannot be converted to int'
        GenericMethods.getPersonInfo(person.getLastName(), person.getAge(), person.getFirstName());
         */
    }
}
