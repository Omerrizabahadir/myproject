package design_patterns.factory_design_pattern_for_cars;

//3. Fabrika -> NESNE üreten yer
public class CarFactory {
    public static Car produceCar(String carType ){
        if(carType.equalsIgnoreCase("Sedan")){
           return  new Sedan();
        }else if(carType.equalsIgnoreCase("SUV")){
            return new SUV();
        }
        return null;
    }
}
