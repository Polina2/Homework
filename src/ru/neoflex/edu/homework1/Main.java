package ru.neoflex.edu.homework1;

import ru.neoflex.edu.homework1.adapter.Computer;
import ru.neoflex.edu.homework1.adapter.IUSBDevice;
import ru.neoflex.edu.homework1.adapter.MemoryCard;
import ru.neoflex.edu.homework1.adapter.USBAdapter;
import ru.neoflex.edu.homework1.factory.CoffeeMachine;
import ru.neoflex.edu.homework1.factory.CoffeeType;
import ru.neoflex.edu.homework1.proxy.DatabaseConnectorProxy;
import ru.neoflex.edu.homework1.proxy.IDatabaseConnector;
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

        //adapter
        Computer computer = new Computer();
        MemoryCard memoryCard = new MemoryCard();
        IUSBDevice usbDevice = new USBAdapter(memoryCard);
        computer.readFromUsbDevice(usbDevice);

        //proxy
        IDatabaseConnector databaseConnector = new DatabaseConnectorProxy("localhost", 5432, "some_db");
        databaseConnector.connect();
        databaseConnector.connect();
    }
}
