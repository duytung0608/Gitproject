package ss5_access_modifier_static_method_static_property.practice05.static_property;

public class Car {
    private String name;
    private String engine;


    public static int numberOfCars;


    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;

        numberOfCars++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setEngine() {
        this.engine = engine;
    }

    public String getEngine() {
        return this.engine;
    }
}
