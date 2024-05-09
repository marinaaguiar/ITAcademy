package io.alecrim.itacademy.sprint1.task4.n2exercise1;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;

public class TestStrings {

    @Test
    public void testStringLength() {
        String message = "Mordor";
        assertThat(message.length(), equalTo(8));
    }
}
