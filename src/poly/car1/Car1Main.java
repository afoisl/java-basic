package poly.car1;

public class Car1Main {

    public static void main(String[] args) {
        Driver driver = new Driver();

        K3car k3car = new K3car();
        driver.setCar(k3car);
        driver.drive();

        // 차량 변경
        Model3Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.drive();

        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive();
    }
}
