package io.alecrim.itacademy.sprint1.task8.n2exercise2;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> loverSongsTS = Arrays.asList("Afterglow", "lover", "The Archer", "The Man", "Cornelia Street", "Daylight");
        List<String> result = StringFilter.filterStringsContainingLetterOAndMoreThan5Letters(loverSongsTS);
        System.out.println(result);
    }
}
