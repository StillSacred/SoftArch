public class SimpleCar implements Car {
    private int carMaxSpeed;

    public SimpleCar(int carMaxSpeed) {
        this.carMaxSpeed = carMaxSpeed;
    }

    @Override
    public int getMaxCarSpeed() {
        return carMaxSpeed;
    }
}