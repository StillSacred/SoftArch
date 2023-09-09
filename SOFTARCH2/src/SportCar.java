public class SportCar extends CarDecorator{

    public SportCar(Car simpleCar) {
        super(simpleCar);
    }

    @Override
    public int getMaxCarSpeed() {
        return car.getMaxCarSpeed() + 100;
    }
}