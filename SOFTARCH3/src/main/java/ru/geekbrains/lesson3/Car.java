package ru.geekbrains.lesson3;

import java.awt.*;

public abstract class Car implements Fueling, Washing{

    //region Constructors

    public Car(String make, String model, Color color) {
        this.make = make;
        this.model = model;
        this.color = color;
    }

    public Car(String make, String model, Color color, FuelType fuelType) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.fuelType = fuelType;
    }

    //endregion

    //region Public Methods

    // Движение
    public abstract void movement();
    // Обслуживание
    public abstract void maintenance();
    // Переключение передач
    public abstract boolean gearShifting();
    // Включение фар
    public abstract boolean switchHeadlights();
    // Включение дворников
    public abstract boolean switchWipers();

    // Подметать
    //public abstract void sweeping();

    public boolean switchFogLights(){
        fogLights = !fogLights;
        return fogLights;
    }

    /**
     * Заправка
     */
    @Override
    public void fuel() {
        if (refueling != null) {
            refueling.fuel(fuelType);
        }
    }

    /**
     * Мыть машину
     */
    @Override
    public void wash() {
        if (carWashing != null) {
            carWashing.washCar();
        }
    }

    protected void setWheelsCount(int wheelsCount){
        this.wheelsCount = wheelsCount;
    }

    protected void setRefuelingStation(Refueling refuelingStation) {
        this.refueling = refuelingStation;
    }

    protected void setCarWash (CarWashing carWash) {
        this.carWashing = carWash;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    protected String getMake() {
        return make;
    }

    protected String getModel() {
        return model;
    }

    //endregion

    //region Private Fields

    // Марка автомобиля
    private String make;

    // Модель
    private String model;

    // Цвет
    private Color color;

    // Тип
    protected CarType type;

    // Число колес
    private int wheelsCount;

    // Тип топлива
    protected FuelType fuelType;

    // Тип коробки передач
    private GearboxType gearboxType;

    // Объем двигателя
    private double engineCapacity;

    // Состояние противотуманных фар
    private boolean fogLights = false;

    private Refueling refueling;

    private CarWashing carWashing;

    //endregion

}