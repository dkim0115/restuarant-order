package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatCode;


/* object - customer, menu, porklet, noodle, cooker, food
   relationship
      -(customer - menu)
      -(customer - cooker)
      -(cooker - food)
   type for each object
      -customer type
      -food type
      -menu type

*/
public class CustomerTest {

    @DisplayName("order in menu")
    @Test
    void orderTest() {
        Customer customer = new Customer();
        Menu menu = new Menu(List.of(new MenuItem("porklet", 5), new MenuItem("noodle", 7)));
        Cooking cooking = new Cooking();

        assertThatCode(()->customer.order("porklet ", menu, cooking))
                .doesNotThrowAnyException();
    }
}
