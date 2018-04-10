package Media_Store;

import java.util.Scanner;

public class Program extends Media {

    protected String version;

    public Program() {
        this.name = "Default program name";
        this.price = 20;
        this.size = 700;
        this.version = "version MathWonder 1.42";
    }

    public Program(String newName, int newPrice, int newSize, String newVersion) {
        this.name = newName;
        this.price = newPrice;
        this.size = newSize;
        this.version = newVersion;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public int getSize() {
        return this.size;
    }

    public String getVersion() {
        return this.version;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setPrice(int newPrice) {
        this.price = newPrice;
    }

    public void setSize(int newSize) {
        this.size = newSize;
    }

    public void setVersion(String newVersion) {
        this.version = newVersion;
    }

    public void use() {
        System.out.println("The program " + this.getName() + " was used. It was " + this.getVersion() + ".");
    }

    public String toString() {
        return "Program: " + this.getName() + ", $" + this.getPrice() + ", " + this.getSize() + " MB, " + this.getVersion();
    }
}
