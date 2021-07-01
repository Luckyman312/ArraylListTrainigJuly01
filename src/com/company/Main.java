package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();
        ArrayList<Car> fastCar = new ArrayList<>();

        cars.add(new Car("Sport",260,"Black"));
        cars.add(new Car("Family",200,"Red"));
        cars.add(new Car("Truck",180,"White"));

        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).maxSpeed >= 200) {
                fastCar.add(cars.get(i));
            }

        }
        for (int i = 0; i < fastCar.size(); i++) {
            System.out.println(fastCar.get(i));

        }
    }
}
