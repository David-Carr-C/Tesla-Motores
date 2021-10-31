package com.tesla;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void agree (Scanner scanner) {
        System.out.println(" (S/n): ");
        boolean proceed = false;
        do {
            char agree = scanner.next().charAt(0);
            if (agree == 'n') {
                System.exit(0);
            } else if (agree=='S') {
                proceed = true;
            } else {
                System.out.println("Select a correct option!");
            }
        } while (!proceed);

    }

    public static void main(String[] args) {
        System.out.println("Welcome to Tesla Motores!");
        System.out.println("Who are you?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        /*Let's check "name" in the database*/
        if (true) {
            System.out.println("Welcome "+name+"!");
            System.out.println("Please put your password :)!");
            do {
                String password = scanner.nextLine();
            } while (false); /*We are going to compare with a database*/

            System.out.println("Access Granted!");
            System.out.print("Would you like to place an order?");
            agree(scanner);
            System.out.println("There are 4 cars: \"Tesla Model S\", \"Tesla Model 3\", \"Tesla Model X\" and \"Tesla Model Y\"");
            //System.out.println("What car would you like to see?");
            scanner.nextLine();
            char select;
            do {
                System.out.println("What car would you like to see?");
                String car = scanner.nextLine();
                if (Objects.equals(car, "Tesla Model S")) {
                    Tesla_Model_S teslamods = new Tesla_Model_S();
                    //Tesla_Model_S.presentation();
                } else if (Objects.equals(car, "Tesla Model 3")) {
                    Tesla_Model_3 teslamod3 = new Tesla_Model_3();
                    teslamod3.presentation(); //Tesla_Model_3.presentation();
                } else if (Objects.equals(car, "Tesla Model X")) {
                    Tesla_Model_X teslamodx = new Tesla_Model_X();
                    //Tesla_Model_X.presentation();
                } else if (Objects.equals(car, "Tesla Model Y")) {
                    Tesla_Model_Y teslamody = new Tesla_Model_Y();
                    //Tesla_Model_Y.presentation();
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

            if (select=='S'){
                System.out.println("Which version do you want?, There are Long Range and Plaid");
                String version = scanner.nextLine();
                if (version == "Long Range") {

                } else if (version == "Plaid") {

                } else  {
                    System.out.println("Something gone wrong!");
                }
            } else {
                System.out.println("I hope you will find something of interest next time!");
            }

        } else {
            System.out.println("Trying");
        }
    }
}
