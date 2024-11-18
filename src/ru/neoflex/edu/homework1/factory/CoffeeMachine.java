package ru.neoflex.edu.homework1.factory;

import java.util.List;

public class CoffeeMachine {

    private final CoffeeFactory coffeeFactory = new CoffeeFactory();

    public void makeCoffee(CoffeeType coffeeType) {
        Coffee coffee = coffeeFactory.getCoffee(coffeeType);
        takeIngredients(coffee.getIngredients());
        mixIngredients(coffee.getIngredients());
        System.out.println("your coffee is ready");
    }

    private void takeIngredients(List<String> ingredients) {
        System.out.println("taking ingredients: " + ingredients.toString());
    }

    private void mixIngredients(List<String> ingredients) {
        System.out.println("mixing ingredients: " + ingredients.toString());
    }
}
