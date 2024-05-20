package io.alecrim.itacademy.sprint1.task8.n1exercise1;

import java.util.List;
import java.util.stream.Collectors;

public class StringFilter {

    public static List<String> filterStringsContainingLetterO(List<String> strings) {
        return strings.stream()
                .filter(s -> s.contains("o"))
                .collect(Collectors.toList());
    }
}
