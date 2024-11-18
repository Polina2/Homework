package ru.neoflex.edu.homework1.proxy;

public class DatabaseConnector implements IDatabaseConnector {
    private String url;

    public DatabaseConnector(String url) {
        this.url = url;
    }

    @Override
    public void connect() {
        System.out.println("Successfully connected to " + url);
    }
}
