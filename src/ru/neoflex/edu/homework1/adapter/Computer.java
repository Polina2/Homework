package ru.neoflex.edu.homework1.adapter;

public class Computer {
    public void readFromUsbDevice(IUSBDevice usbDevice) {
        System.out.println("read information from " + usbDevice.toString());
        usbDevice.read();
    }
}
