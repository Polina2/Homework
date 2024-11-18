package ru.neoflex.edu.homework1.factory;

public class CoffeeFactory {
    public Coffee getCoffee(CoffeeType coffeeType) {
        switch (coffeeType) {
            case ESPRESSO -> {
                return new Espresso();
            }
            case AMERICANO -> {
                return new Americano();
            }
            default -> throw new IllegalArgumentException("No such coffee type");
        }
    }
}
