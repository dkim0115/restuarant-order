package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class CookTest {

    @DisplayName("making food")
    @Test
    void createTest() {
        assertThatCode(()->new Cook("dumpling", 5))
                .doesNotThrowAnyException();

    }
}
