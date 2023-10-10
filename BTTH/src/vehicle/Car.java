package vehicle;

public class Car extends Vehicle{
//    private String type;
    public Car() {
    }

    public Car(String brand, String color) {
        super(brand, color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + this.getBrand() + '\'' +
                "color='" + this.getColor() + '\'' +
                '}';
    }
}
