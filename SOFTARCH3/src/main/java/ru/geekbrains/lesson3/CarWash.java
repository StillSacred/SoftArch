package ru.geekbrains.lesson3;

public class CarWash implements CarWashing{
    @Override
    public void washCar() {
        System.out.println("Машина помыта");
    }
}