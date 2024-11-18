package ru.neoflex.edu.homework1;

import ru.neoflex.edu.homework1.factory.CoffeeMachine;
import ru.neoflex.edu.homework1.factory.CoffeeType;
import ru.neoflex.edu.homework1.singleton.LoggerSingleton;
import ru.neoflex.edu.homework1.singleton.SomeClass;

public class Main {
    public static void main(String[] args) {
        //singleton
        SomeClass someClass = new SomeClass();
        LoggerSingleton loggerSingleton = LoggerSingleton.getInstance();
        loggerSingleton.classLog(someClass, "start doing something");
        someClass.doSomething();
        loggerSingleton.classLog(someClass, "something done");

        //factory
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.makeCoffee(CoffeeType.AMERICANO);
    }
}
