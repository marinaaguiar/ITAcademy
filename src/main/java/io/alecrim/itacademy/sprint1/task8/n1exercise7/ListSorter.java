package io.alecrim.itacademy.sprint1.task8.n1exercise7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListSorter {
    public static void sortList() {
        List<Object> mixedList = Arrays.asList(5, "apple", 3, "banana", 2, "kiwi", 4, "cherry", 1, "strawberry");
        List<String> sortedStrings = mixedList.stream()
                .filter(object -> object instanceof String)
                .map(object -> (String) object)
                .sorted(Comparator.comparingInt(String::length).reversed())
                .collect(Collectors.toList());
        System.out.println("Sorted strings by length: " + sortedStrings);
    }
}
