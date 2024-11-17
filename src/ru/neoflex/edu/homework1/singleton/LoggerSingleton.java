package ru.neoflex.edu.homework1.singleton;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LoggerSingleton {
    private LoggerSingleton() {

    }

    private static class LoggerSingletonHolder {
        public static final LoggerSingleton LOGGER_INSTANCE = new LoggerSingleton();
    }

    public static LoggerSingleton getInstance() {
        return LoggerSingletonHolder.LOGGER_INSTANCE;
    }

    public void classLog(Object obj, String info) {
        String className = obj.getClass().getName();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yy");
        String curDate = sdf.format(new Date());
        System.out.println("Log info: " + curDate + " - " + className + " - " + info);
    }
}
