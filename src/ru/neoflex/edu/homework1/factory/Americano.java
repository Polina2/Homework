package ru.neoflex.edu.homework1.factory;

import java.util.List;

public class Americano implements Coffee {
    @Override
    public List<String> getIngredients() {
        return List.of("coffee", "water");
    }
}
