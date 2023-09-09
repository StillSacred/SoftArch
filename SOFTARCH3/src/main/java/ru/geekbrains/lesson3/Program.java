package ru.geekbrains.lesson3;

import java.awt.*;

public class Program {

    /**
     * 1. Спроектировать абстрактный класс «Car» у которого должны
     * быть свойства: марка, модель, цвет, тип кузова, число колёс, тип
     * топлива, тип коробки передач, объём двигателя; методы:
     * движение, обслуживание, переключение передач, включение
     * фар, включение дворников.
     * <p>
     * 2. Создать конкретный автомобиль путём наследования класса
     * «Car».
     * 3. Расширить абстрактный класс «Car», добавить метод: подметать
     * улицу. Создать конкретный автомобиль путём наследования
     * класса «Car». Провести проверку принципа SRP.
     * <p>
     * 4. Расширить абстрактный класс «Car», добавить метод:
     * включение противотуманных фар, перевозка груза. Провести
     * проверку принципа OCP.
     * <p>
     * 5. Создать конкретный автомобиль путём наследования класса
     * «Car», определить число колёс = 3. Провести проверку принципа LSP.
     * <p>
     * 6. Создать конкретный автомобиль путём наследования класса
     * «Car», определить метод «движение» - «полёт». Провести
     * проверку принципа LSP.
     * <p>
     * 7. Создать интерфейс «Заправочная станция», создать метод:
     * заправка топливом.
     * <p>
     * <p>
     * 8. Имплементировать метод интерфейса «Заправочная станция» в
     * конкретный класс «Car».
     * <p>
     * 9. Добавить в интерфейс «Заправочная станция» методы: протирка
     * лобового стекла, протирка фар, протирка зеркал.
     * <p>
     * 10. Имплементировать все методы интерфейса «Заправочная
     * станция» в конкретный класс «Car». Провести проверку
     * принципа ISP. Создать дополнительный/е интерфейсы и
     * имплементировать их в конкретный класс «Car». Провести
     * проверку принципа ISP.
     * <p>
     * 11. Создать путём наследования класса «Car» два
     * автомобиля: с бензиновым и дизельным двигателями,
     * имплементировать метод «Заправка топливом» интерфейса
     * «Заправочная станция». Реализовать заправку каждого
     * автомобиля подходящим топливом. Провести проверку принципа DIP.
     *
     * @param args
     */
    public static void main(String[] args) {

        Harvester harvester = new Harvester("Уборщик", "3000", Color.BLACK, FuelType.Gasoline);
        SportCar sportCar = new SportCar("Спорткар", "123", Color.BLUE, FuelType.Gasoline);
        FlyCar flyCar = new FlyCar("Летающий автомобиль", "Летун", Color.GRAY, FuelType.Diesel);

        RefuelingStation refuelingStation = new RefuelingStation();
        CarWashing carWash = new CarWash();

        fuelEvent(harvester, refuelingStation);
        fuelEvent(sportCar, refuelingStation);
        fuelEvent(flyCar, refuelingStation);
        carWashEvent(harvester, carWash);
        carWashEvent(sportCar, carWash);
        carWashEvent(flyCar, carWash);
    }

    public static double calculateMaintenance(Car car) {
        if (car.getWheelsCount() == 6) {
            return 1500 * 6;
        } else {
            return 1000 * 4;
        }
    }

    public static void fuelEvent(Car car, RefuelingStation refuelingStation) {
        System.out.println(car.getMake() + " " + car.getModel() + " " + "прибыл на заправочную станцию");
        car.setRefuelingStation(refuelingStation);
        car.fuel();
        System.out.println(car.getMake() + " " + car.getModel() + " " + "покинул заправочную станцию");
        car.setRefuelingStation(null);
    }

    public static void carWashEvent(Car car, CarWashing carWash) {
        System.out.println(car.getMake() + " " + car.getModel() + " " + "прибыл на автомойку");
        car.setCarWash(carWash);
        car.wash();
        System.out.println(car.getMake() + " " + car.getModel() + " " + "покинул автомойку");
        car.setCarWash(null);
    }
}