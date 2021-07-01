package com.company;

public class Car {
    String type;
    int maxSpeed;
    String color;

    @Override
    public String toString() {
        return "Type car : " + type + " ||| " + "Max Speed: " + maxSpeed + " ||| " + "Color : " + color;


    }
    public Car(String type, int maxSpeed, String color){
        this.type = type;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

}
