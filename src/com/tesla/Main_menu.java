package com.tesla;

import java.util.Objects;
import java.util.Scanner;

public class Main_menu {
    private String name;
    private Scanner scanner = new Scanner(System.in); //Me aconseja ponerle final porque este objeto nunca debera cambiar
    private String password; //Me aconseja alojar la variable en la funcion que la ocupa, porque las demas funciones no la necesitan o no la llaman
    private char select;
    private String car; //Lo mismo que password

    public Main_menu() {
        welcomeAndScan();
    }

    private void welcomeAndScan() {
        System.out.println("Welcome to Tesla Motores!");
        System.out.println("Who are you?");
        //Scanner scanner = new Scanner(System.in); // Ya se declaro el objeto como una variable, funciona en cualquier sitio y no se tiene que volver a declarar
        name = scanner.nextLine();
        if (Objects.equals(name, "uwu")) { //name=="uwu" NO SIRVE, it doesn't work
            //scanner.close(); this close/destroy the Object scan in this Main_menu.java - Este comando destruye el objeto dentro de esta clase
            nameFound();
        } else {
            nameNotFound();
        }
    }

    private void nameNotFound() {
        System.out.println("No match");
        scanner.close();
    }

    private void nameFound() {
        System.out.println("Welcome "+name+"!");
        System.out.println("Please put your password :)!");
        int limit = 0;
        do {
            if (limit == 5) {
                nameNotFound();
                System.exit(0);
            }
            if ((limit >= 1)) { //We can put  "&& (limit != 5)", but in order to do, this works
                System.out.println("Try again");
            }
            password = scanner.nextLine();
            limit++;
        } while (!Objects.equals(password, "123"));
        accessGranted();
    }

    private void accessGranted() {
        System.out.println("Access Granted!");
        System.out.print("Would you like to place an order?");
        agree();
        System.out.println("There are 4 cars: \"Tesla Model S\", \"Tesla Model 3\", \"Tesla Model X\" and \"Tesla Model Y\"");
        scanner.nextLine();
        selectACar();
    }

    private void agree() {
        System.out.println(" (S/n): ");
        boolean proceed = false;
        do {
            char agree = scanner.next().charAt(0);
            if (agree == 'n') {
                hopeU();
                System.exit(0); //O podemos simplemente redirigirlo a una funcion que termine los pasos de welcomeAndScan();
                //o sea simplemente crear una funcion y ya, esta terminaria y el constructor tambien
            } else if (agree=='S') {
                proceed = true;
            } else {
                System.out.println("Select a correct option!");
            }
        } while (!proceed);
    }

    private void selectACar() {
        do {
            System.out.println("What car would you like to see?");
            car = scanner.nextLine();
            if (Objects.equals(car, "Tesla Model S")) {
                /*Tesla_Model_S teslamods = new Tesla_Model_S();
                teslamods.presentation();*/
                Tesla_Model_S.presentation();
            } else if (Objects.equals(car, "Tesla Model 3")) {
                /*Tesla_Model_3 teslamod3 = new Tesla_Model_3();
                teslamod3.presentation();*/
                Tesla_Model_3.presentation();
            } else if (Objects.equals(car, "Tesla Model X")) {
                /*Tesla_Model_X teslamodx = new Tesla_Model_X();
                teslamodx.presentation();*/
                Tesla_Model_X.presentation();
            } else if (Objects.equals(car, "Tesla Model Y")) {
                /*Tesla_Model_Y teslamody = new Tesla_Model_Y();
                teslamody.presentation();*/
                Tesla_Model_Y.presentation();
            } else {
                System.out.println("No match");
            }
            System.out.println("Do you want to buy the "+ car +"? (S/n): ");
            System.out.println("To exit press \"x\"");
            select = scanner.next().charAt(0);
            scanner.nextLine();
            if (select=='x') {
                break;
            }
        } while (select!='S');
        version();

    }

    private void version() {
        if (select=='S'){
            do {
                System.out.println("Which version do you want?, There are \"Long Range\" and \"Plaid\":");
                String version = scanner.nextLine();
                if (Objects.equals(version, "Long Range")) {
                    funcLong();
                } else if (Objects.equals(version, "Plaid")) {
                    funcPlaid();
                } else {
                    System.out.println("Something gone wrong!");
                }
            } while (true);
        } else {
            hopeU();
        }
    }

    private void hopeU() {
        System.out.println("I hope you will find something of interest next time!");
        scanner.close();
    }

    private void funcLong() {
        boolean self = false;
        if (Objects.equals(car, "Tesla Model S")) {
                Tesla_Model_S teslamods = new Tesla_Model_S();
                self = teslamods.funcLong(scanner);

        } else if (Objects.equals(car, "Tesla Model 3")) {
                Tesla_Model_3 teslamod3 = new Tesla_Model_3();

        } else if (Objects.equals(car, "Tesla Model X")) {
                Tesla_Model_X teslamodx = new Tesla_Model_X();

        } else if (Objects.equals(car, "Tesla Model Y")) {
                Tesla_Model_Y teslamody = new Tesla_Model_Y();

        } else {
            System.out.println("ERROR 9999!");
        }
    }

    private void funcPlaid() {
        boolean self = false;
        if (Objects.equals(car, "Tesla Model S")) {
                Tesla_Model_S teslamods = new Tesla_Model_S();
                self = teslamods.funcPlaid(scanner);
        } else if (Objects.equals(car, "Tesla Model 3")) {
                /*Tesla_Model_3 teslamod3 = new Tesla_Model_3();
                teslamod3.presentation();*/
        } else if (Objects.equals(car, "Tesla Model X")) {
                /*Tesla_Model_X teslamodx = new Tesla_Model_X();
                teslamodx.presentation();*/
        } else if (Objects.equals(car, "Tesla Model Y")) {
                /*Tesla_Model_Y teslamody = new Tesla_Model_Y();
                teslamody.presentation();*/
        } else {
            System.out.println("ERROR 9999!");
        }
    }
}
