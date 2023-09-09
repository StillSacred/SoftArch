package ru.geekbrains.lesson3;

import java.awt.*;

public class SportCar extends Car {
    public SportCar(String make, String model, Color color) {
        super(make, model, color);
        setWheelsCount(4);
    }

    public SportCar(String make, String model, Color color, FuelType fuelType) {
        super(make, model, color, fuelType);
        setWheelsCount(4);
    }

    @Override
    public void movement() {
    }

    @Override
    public void maintenance() {
    }

    @Override
    public boolean gearShifting() {
        return false;
    }

    @Override
    public boolean switchHeadlights() {
        return false;
    }

    @Override
    public boolean switchWipers() {
        return false;
    }
}