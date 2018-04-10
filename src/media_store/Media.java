package Media_Store;

public class Media {

    protected String name;
    protected int price;
    protected int size;

    public Media() {
        name = "Default media name";
        price = 10;
        size = 300;
    }

    public Media(String newName, int newPrice, int newSize) {
        name = newName;
        price = newPrice;
        size = newSize;
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

    public void setName(String newName) {
        this.name = newName;
    }

    public void setPrice(int newPrice) {
        this.price = newPrice;
    }

    public void setSize(int newSize) {
        this.size = newSize;
    }

    public void use() {
        System.out.println("The media was used");
    }

    public String toString() {
        return "Media: " + this.getName() + ", $" + this.getPrice() + ", " + this.getSize() + " MB";
    }
}
