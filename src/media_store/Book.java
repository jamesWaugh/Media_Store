package Media_Store;

import java.util.Scanner;

public class Book extends Media {

    protected int pages;

    public Book() {
        this.name = "Defalut book name";
        this.price = 10;
        this.size = 700;
        this.pages = 200;
    }

    public Book(String newName, int newPrice, int newSize, int newPages) {
        this.name = newName;
        this.price = newPrice;
        this.size = newSize;
        this.pages = newPages;
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

    public int getPages() {
        return this.pages;
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

    public void setPages(int newPages) {
        this.pages = newPages;
    }

    public void use() {
        System.out.println("The book " + this.getName() + " was read. It was " + this.getPages() + " pages long.");
    }

    public String toString() {
        return "Book: " + this.getName() + ", $" + this.getPrice() + ", " + this.getSize() + " MB, " + this.getPages() + " pages";
    }
}
