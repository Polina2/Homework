package ru.neoflex.edu.homework1.adapter;

public class USBAdapter implements IUSBDevice {
    private final MemoryCard memoryCard;

    public USBAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }
    @Override
    public void read() {
        memoryCard.read();
    }
}
