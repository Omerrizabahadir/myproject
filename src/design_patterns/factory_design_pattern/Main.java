package design_patterns.factory_design_pattern;

public class Main {
    public static void main(String[] args) {
        Car sedan = CarFactory.produceCar("Sedan");
        sedan.drive();

        Car suv = CarFactory.produceCar("SUV");
        suv.drive();
    }
}
