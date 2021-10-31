package com.tesla;

import java.util.Objects;
import java.util.Scanner;

public class Main_menu {
    public Main_menu() {
        welcomeAndScan();
    }

    private void welcomeAndScan() {
        System.out.println("Welcome to Tesla Motores!");
        System.out.println("Who are you?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if (Objects.equals(name, "uwu")) { //name=="uwu" NO SIRVE, it doesn't work
            nameFound(name,scanner);
        } else {
            nameNotFound(scanner);
        }
    }

    private void nameNotFound(Scanner scanner) {
        System.out.println("No match");
        scanner.close();
    }

    private void nameFound(String name, Scanner scanner) {
        System.out.println("Welcome "+name+"!");
        System.out.println("Please put your password :)!");
        int limit = 0;
        String password;
        do {
            if (limit == 5) {
                nameNotFound(scanner);
                System.exit(0);
            }
            if ((limit >= 1)) { //We can put  "&& (limit != 5)", but in order to do, this works
                System.out.println("Try again");
            }
            password = scanner.nextLine();
            limit++;
        } while (!Objects.equals(password, "123"));
        accessGranted(scanner, name);
    }

    private void accessGranted(Scanner scanner, String name) {
        System.out.println("Access Granted!");
        System.out.print("Would you like to place an order?");
        agree(scanner);
        System.out.println("There are 4 cars: \"Tesla Model S\", \"Tesla Model 3\", \"Tesla Model X\" and \"Tesla Model Y\"");
        scanner.nextLine();
        selectACar(scanner,name);
    }

    private void agree(Scanner scanner) {
        System.out.println(" (S/n): ");
        boolean proceed = false;
        do {
            char agree = scanner.next().charAt(0);
            if (agree == 'n') {
                hopeU(scanner);
                System.exit(0);
            } else if (agree=='S') {
                proceed = true;
            } else {
                System.out.println("Select a correct option!");
            }
        } while (!proceed);
    }

    private void selectACar(Scanner scanner, String name) {
        char select;
        do {
            System.out.println("What car would you like to see?");
            String car = scanner.nextLine();
            if (Objects.equals(car, "Tesla Model S")) {
                Tesla_Model_S teslamods = new Tesla_Model_S();
                teslamods.presentation();
                //Tesla_Model_S.presentation();
            } else if (Objects.equals(car, "Tesla Model 3")) {
                Tesla_Model_3 teslamod3 = new Tesla_Model_3();
                teslamod3.presentation();
                //Tesla_Model_3.presentation();
            } else if (Objects.equals(car, "Tesla Model X")) {
                Tesla_Model_X teslamodx = new Tesla_Model_X();
                teslamodx.presentation();
                //Tesla_Model_X.presentation();
            } else if (Objects.equals(car, "Tesla Model Y")) {
                Tesla_Model_Y teslamody = new Tesla_Model_Y();
                teslamody.presentation();
                //Tesla_Model_Y.presentation();
            } else {
                nameNotFound(scanner);
            }
            System.out.println("Do you want to buy the "+ car +"? (S/n): ");
            System.out.println("To exit press \"x\"");
            select = scanner.next().charAt(0);
            scanner.nextLine();
            if (select=='x') {
                break;
            }
        } while (select!='S');
        version(scanner,name,select);

    }

    private void version(Scanner scanner, String name, char select) {
        if (select=='S'){
            System.out.println("Which version do you want?, There are Long Range and Plaid");
            String version = scanner.nextLine();
            if (Objects.equals(version, "Long Range")) {

            } else if (Objects.equals(version, "Plaid")) {

            } else  {
                System.out.println("Something gone wrong!");
            }
        } else {
            hopeU(scanner);
        }
    }

    private void hopeU(Scanner scanner) {
        System.out.println("I hope you will find something of interest next time!");
        scanner.close();
    }
}
