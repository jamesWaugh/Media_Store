package Media_Store;

import java.util.Scanner;

public class Customer {

    protected String name;
    protected int balance;
    protected int storage;
    protected Media[] mediaBought;
    protected int boughtHolder = 0;

    public int getBoughtHolder() {
        return this.boughtHolder;
    }

    public void setBoughtHolder(int newHolder) {
        this.boughtHolder = newHolder;
    }

    public Customer() {
        this.name = "Bob";
        this.balance = 200;
        this.storage = 1000;
        this.mediaBought = new Media[100];
    }

    public Customer(String newName, int newBalance, int newStorage, int x) {
        this.name = newName;
        this.balance = newBalance;
        this.storage = newStorage;
        this.mediaBought = new Media[x];
    }

    public String getName() {
        return this.name;
    }

    public int getBalance() {
        return this.balance;
    }

    public int getStorage() {
        return this.storage;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setBalance(int newBalance) {
        this.balance = newBalance;
    }

    public void setStorage(int newStorage) {
        this.storage = newStorage;
    }

    public void browse() {
        System.out.println("");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < mediaBought.length; i++) {
            System.out.println("Owned Media #" + (i + 1) + ": " + mediaBought[i]);
        }

        System.out.println("Enter the number for the item you want to use, or enter 555 to skip: ");
        int a = scan.nextInt();
        if (a == 555) {
            System.out.println("skipped");
            System.out.println("");
        } else {
            mediaBought[a - 1].use();
            System.out.println("");
        }
    }

    public void menu() {
        Scanner scan = new Scanner(System.in);
        int x = 0;
        while (x != 4) {
            System.out.println("1. Add Money to Balance \n2. Browse Owned Media \n3. Shop \n4. Log Out");
            x = scan.nextInt();

            if (x == 1) {
                System.out.println("\nCurrent Balance: $" + this.getBalance());
                System.out.println("Input amount to add");
                int y = scan.nextInt();
                this.setBalance(this.getBalance() + y);
                System.out.println("Current Balance: $" + this.getBalance() + "\n");

            } else if (x == 2) {
                this.browse();

            } else if (x == 3) {
                Store newStore = new Store();
                newStore.storeCustomer[newStore.getPlaceHolder()] = this;
                System.out.println("");
                for (int i = 0; i < newStore.storeMedia.length; i++) {
                    System.out.println("Store Media #" + (i + 1) + ": " + newStore.storeMedia[i]);
                }
                System.out.println("");
                System.out.println("Enter the number for the item you want to purchase");
                int d = scan.nextInt();
                if (this.balance >= newStore.storeMedia[d - 1].price) {
                    if (this.storage >= newStore.storeMedia[d - 1].size) {
                        this.mediaBought[this.getBoughtHolder()] = newStore.storeMedia[d - 1];
                        this.setBoughtHolder(this.getBoughtHolder() + 1);
                        System.out.println("Purchased: " + newStore.storeMedia[d - 1].name);
                        this.setBalance(this.getBalance() - newStore.storeMedia[d - 1].price);
                        this.setStorage(this.getStorage() - newStore.storeMedia[d - 1].size);
                    } else {
                        System.out.println("Not enough storage space. Purchase more for $25, YES or NO?");
                        String s = scan.next();
                        if (s.equals("YES")) {
                            if (this.balance >= 25) {
                                this.storage += 1000;
                                this.balance -= 25;
                                System.out.println("Storage purchased. Current storage: " + this.getStorage());
                            } else {
                                System.out.println("Insufficient funds. Input more in the main menu");
                            }
                        }
                    }
                } else {
                    System.out.println("Insufficient funds. Input more in the main menu");
                }
                System.out.println("");
                newStore.setPlaceHolder(newStore.getPlaceHolder() + 1);
            }
        }
        System.out.println("");
        System.out.println("Logged Out");
        System.out.println("");
    }
}
