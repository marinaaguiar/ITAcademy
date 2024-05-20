package io.alecrim.itacademy.sprint1.task8.n2exercise2;

import java.util.List;
import java.util.stream.Collectors;

public class StringFilter {

    public static List<String> filterStringsContainingLetterOAndMoreThan5Letters(List<String> strings) {
        return strings.stream()
                .filter(s -> s.contains("o") && s.length() > 5)
                .collect(Collectors.toList());
    }
}
