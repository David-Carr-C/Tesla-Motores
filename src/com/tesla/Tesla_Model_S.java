package com.tesla;

import java.sql.Struct;
import java.util.Objects;
import java.util.Scanner;

public class Tesla_Model_S implements TeslaMotors{//Here
    protected String name = null;
    private int range = 0;
    private int max = 0;
    private float fromZeroTo60mph = 0.00F;
    /*All of this is going to be change if the user select "Long Range" or "Plaid"*/
    private double cost = 0.00;
    private String color = null;
    private String wheels = null;
    private String colorInterior = null;
    private boolean isItFullSelfDriving = false;

    /*Date*/
    private int day = 0;
    private int month = 0;
    private int year = 0;
    public void delivery() {
        System.out.println("Your delivery day is: ");
    }

    public boolean purchase() {
        System.out.println("Sell out!");
        return true;
    }

    public static void presentation () {
        System.out.println("_______________________________");
        System.out.println("|Tesla Model S\t\t\t\t  |\n|Specifications:  \t\t\t  |");
        System.out.println("_______________________________");
        System.out.println("|Long range\t\t\t\t\t  |");//*
        System.out.println("|Range: 405 mi\t\t\t\t  |");//*
        System.out.println("|Top Speed: 155 mph\t\t\t  |");//*
        System.out.println("|0-60mph: 3.1 seconds\t\t  |");//*
        System.out.println("|Price: 94.990$\t\t\t\t  |");//*
        System.out.println("|Optional self-driving:       |\n|+10,000 US$\t\t\t\t  |");//*
        System.out.println("_______________________________");
        System.out.println("|Plaid\t\t\t\t\t\t  |");//*
        System.out.println("|Range: 396 mi\t\t\t\t  |");//*
        System.out.println("|Top Speed: 200 mph\t\t\t  |");//*
        System.out.println("|0-60mph: 1.99 seconds\t\t  |");//*
        System.out.println("|Price: 129.990$\t\t\t  |");//*
        System.out.println("|1,020 horsepower\t\t\t  |");//*
        System.out.println("|Optional self-driving:       |\n|+10,000 US$\t\t\t\t  |");//*
        System.out.println("_______________________________");
    }

    public boolean funcLong(Scanner scanner) {
        name = "Tesla Model S Long Range Edition";
        range = 405;
        max = 155;
        fromZeroTo60mph = 3.1F;
        cost = 94990.00;
        System.out.println("Do you want the Full Self-driving (10,000$+)? (YES/NO): ");
        String question = scanner.nextLine();
        boolean selfdriving = false;
        if (Objects.equals(question, "YES")) {
            selfdriving = true;
            cost = cost + 10000.00;
            System.out.println("The cost is: 104,990 US$");
        } else {
            System.out.println("The cost is: 94,990 US$");
        }
        return selfdriving;
    }

    public boolean funcPlaid(Scanner scanner) {
        name = "Tesla Model S Plaid Edition";
        range = 396;
        max = 200;
        fromZeroTo60mph = 1.99F;
        cost = 129990.00;
        System.out.println("Do you want the Full Self-driving (10,000$+)? (YES/NO): ");
        String question = scanner.nextLine();
        boolean selfdriving = false;
        if (Objects.equals(question, "YES")) {
            selfdriving = true;
            cost = cost + 10000.00;
            System.out.println("The cost is: 139,990 US$");
        } else {
            System.out.println("The cost is: 129,990 US$");
        }
        return selfdriving;
    }
}
