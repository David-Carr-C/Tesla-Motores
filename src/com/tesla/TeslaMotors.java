package com.tesla;

public interface TeslaMotors {
    String name = null;
    int speed = 0;
    int max = 0;
    float fromZeroTo60mph = 0.00F;
    /*All of this is going to be change if the user select "Long Range" or "Plaid"*/
    double cost = 0.00;
    String color = null;
    String wheels = null;
    String colorInterior = null;
    boolean isItFullSelfDriving = false;

    boolean purchase();
    void delivery();
    int day = 0;
    int month = 0;
    int year = 0;
}
