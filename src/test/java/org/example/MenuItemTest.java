package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class MenuItemTest {

    @DisplayName("Generate menu")
    @Test
    void createMenu() {
        assertThatCode(()->new MenuItem("dumpling", 5))
                .doesNotThrowAnyException();
    }
}
