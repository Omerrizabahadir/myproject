package design_patterns.factory_design_pattern_for_cars;

public class Main {
    public static void main(String[] args) {
        Car sedan = CarFactory.produceCar("Sedan");
        sedan.drive();

        Car suv = CarFactory.produceCar("SUV");
        suv.drive();
    }
}
