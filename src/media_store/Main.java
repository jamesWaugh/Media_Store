package Media_Store;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Customer names: James, Bob, Susan
        Customer james = new Customer("James", 200, 1000, 100);
        Customer bob = new Customer();
        Customer susan = new Customer("Susan", 20, 1000, 100);

        System.out.println("Enter your name");
        String s = scan.nextLine();
        System.out.println("");

        while (s.equals("James") || s.equals("Bob") || s.equals("Susan")) {
            while (s.equals("James")) {
                james.menu();
                //the second "enter your name" is to refresh the while statement and allow a different user's name to be used
                System.out.println("Enter your name");
                s = scan.nextLine();
                System.out.println("");
            }
            while (s.equals("Bob")) {
                bob.menu();
                System.out.println("Enter your name");
                s = scan.nextLine();
                System.out.println("");
            }
            while (s.equals("Susan")) {
                susan.menu();
                System.out.println("Enter your name");
                s = scan.nextLine();
                System.out.println("");
            }
        }
    }
}
