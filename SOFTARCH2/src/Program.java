public class Program {
    public static void main(String[] args) {
        SimpleCar simpleCar = new SimpleCar(150);
        SportCar sportCar = new SportCar(simpleCar);
        System.out.println("Simple car speed: " + simpleCar.getMaxCarSpeed());
        System.out.println("Sport car speed: " + sportCar.getMaxCarSpeed());
    }
}