package design_patterns.factory_design_pattern_for_cars;

//2.  Araba türü -> car sınıfını implement edecek
public class SUV implements Car{


    @Override
    public void drive() {
        System.out.println("SUV Car is driving.");
    }
}
