package HW6;


public class Laptop {
    public Integer romCapacity;
    public String romType;
    public int ram;
    public String os;
    public String color;

    public Laptop(int rom, String type, int ram, String os, String color){
        this.romCapacity = rom;
        this.romType = type;
        this.ram = ram;
        this.os = os;
        this.color = color;
    }

    @Override
    public String toString() {
        return "ROM Capacity: " + this.romCapacity + " ROM Type: " + this.romType + " RAM: " + this.ram + " OS: " + this.os + " Color: " + this.color;
    }
}
