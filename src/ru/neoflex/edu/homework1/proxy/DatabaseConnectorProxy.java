package ru.neoflex.edu.homework1.proxy;

public class DatabaseConnectorProxy implements IDatabaseConnector {
    private DatabaseConnector databaseConnector;
    private String host;
    private int port;
    private String dbName;

    public DatabaseConnectorProxy(String host, int port, String dbName) {
        this.host = host;
        this.port = port;
        this.dbName = dbName;
    }

    @Override
    public void connect() {
        if (databaseConnector == null) {
            databaseConnector = new DatabaseConnector(host + ':' + port + '/' + dbName);
            System.out.println("New connection");
        }
        else {
            System.out.println("Old connection");
        }
        databaseConnector.connect();
    }
}
