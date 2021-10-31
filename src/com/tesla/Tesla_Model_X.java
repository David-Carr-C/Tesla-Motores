package com.tesla;

public class Tesla_Model_X implements TeslaMotors{
    private String name = null;
    private int speed = 0;
    private int max = 0;
    private float fromZeroTo60mph = 0.00F;
    /*All of this is going to be change if the user select "Long Range" or "Plaid"*/
    private double cost = 0.00;
    private String color = null;
    private String wheels = null;
    private String colorInterior = null;
    private boolean isItFullSelfDriving = false;

    public boolean purchase() {
        System.out.println("Sell out!");
        return true;
    }
    public void delivery() {
        System.out.println("Your delivery day is: ");
    }
    private int day = 0;
    private int month = 0;
    private int year = 0;

    public static void presentation () {
        System.out.println("Tesla Model X\nSpecifications:\n");
    }
}
