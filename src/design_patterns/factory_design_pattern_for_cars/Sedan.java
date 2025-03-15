package design_patterns.factory_design_pattern_for_cars;

//2.  Araba Türü  -> car sınıfını implement edecek
public class Sedan implements Car{

    @Override
    public void drive() {
        System.out.println("Sedan Car is driving.");
    }
}
