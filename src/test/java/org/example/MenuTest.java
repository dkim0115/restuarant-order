package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

public class MenuTest {

    @DisplayName("return a menu")
    @Test
    void chooseTest() {
        Menu menu = new Menu(List.of(new MenuItem("porklet", 5), new MenuItem("noodle", 7)));

        MenuItem menuItem = menu.choose("noodle");

       assertThat(menuItem).isEqualTo(new MenuItem("noodle", 7));
    }

    @DisplayName("if wrong menu item is ordered")
    @Test
    void chooseTest2() {
        Menu menu = new Menu(List.of(new MenuItem("porklet", 5), new MenuItem("noodle", 7)));


        assertThatCode(()->menu.choose("chicken"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("no menu item");
    }
}
