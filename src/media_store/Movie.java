package Media_Store;

import java.util.Scanner;

public class Movie extends Media {

    protected int runLength;

    public Movie() {
        this.name = "Default movie name";
        this.price = 20;
        this.size = 700;
        this.runLength = 80;
    }

    public Movie(String newName, int newPrice, int newSize, int newRunLength) {
        this.name = newName;
        this.price = newPrice;
        this.size = newSize;
        this.runLength = newRunLength;
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

    public int getRunLength() {
        return this.runLength;
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

    public void setRunLength(int newRunLength) {
        this.runLength = newRunLength;
    }

    public void use() {
        System.out.println("The video " + this.getName() + " was played. It was " + this.getRunLength() + " minutes long.");
    }

    public String toString() {
        return "Movie: " + this.getName() + ", $" + this.getPrice() + ", " + this.getSize() + " MB, " + this.getRunLength() + " minutes long";
    }
}
