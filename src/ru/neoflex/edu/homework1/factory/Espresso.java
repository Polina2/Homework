package ru.neoflex.edu.homework1.factory;

import java.util.Arrays;
import java.util.List;

public class Espresso extends Coffee {
    @Override
    public List<String> getIngredients() {
        return List.of("coffee");
    }
}
