package ss5_access_modifier_static_method_static_property.practice05.static_property;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3", "Skyactiv 3");
        System.out.println(Car.numberOfCars);

        Car car2 = new Car("Mazda 6", "Skyactiv 6");
        System.out.println(Car.numberOfCars);
    }
}
// trường numberOfCars được khai báo là static nên bất kì đối tượng nào khởi tạo thì đều dùng chung 1 trường đó mà k thể tạo ra bản sao khác