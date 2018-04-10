package Media_Store;

public class Store {

    protected Media[] storeMedia = {new Program("Matlub", 50, 2000, "version 6"), new Book("This is a book title", 300, 750, 200), new Movie("Super Omega Movietimes", 1000, 3575, 20), new Program("Crazy Program whooaaa", 40, 200, "version 7.65"), new Movie("Media v2", 30, 450, 200), new Book("Carl Math Thing", 40, 100, 90), new Movie("Movie v2", 10, 50, 40), new Program("Prog Math stuff", 60, 740, "version Superdoop 2"), new Book("Overpriced, tiny booklet for N00Bs", 300, 50, 2), new Book(), new Movie(), new Program(), new Media(), new Book("Brook Book", 60, 1050, 600), new Movie("Conan the Barbarian", 10, 550, 129), new Program("Thulsa Doom's math help", 200, 1850, "version DoomScoop 3"), new Program("Matlava", 600, 600, "version 600"), new Book(), new Movie(), new Program()};
    protected Customer[] storeCustomer = new Customer[3];
    protected int placeHolder = 0;

    public int getPlaceHolder() {
        return placeHolder;
    }

    public void setPlaceHolder(int newHolder) {
        this.placeHolder = newHolder;
    }
}
