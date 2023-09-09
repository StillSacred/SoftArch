public abstract class CarDecorator implements Car{
    protected Car car;

    protected CarDecorator(Car simpleCar) {
        this.car = simpleCar;
    }

    @Override
    public abstract int getMaxCarSpeed();
}