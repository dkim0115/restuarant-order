package org.example;

import java.util.List;

public class Menu {
    private final List<MenuItem> menuIteams;

    public Menu(List<MenuItem> menuItems) {
        this.menuIteams = menuItems;


    }

    public MenuItem choose(String name) {
        return this.menuIteams.stream()
                .filter(menuItem->menuItem.matches(name))
                .findFirst()
                .orElseThrow(()->new IllegalArgumentException("no menu item"));
    }
}
