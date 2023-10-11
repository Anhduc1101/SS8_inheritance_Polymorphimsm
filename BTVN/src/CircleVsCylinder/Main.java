package CircleVsCylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "red");
        System.out.println(circle.toString());
        Circle cylinder = new Cylinder(circle.getRadius(), circle.getColor(), 8);
        System.out.println(cylinder.toString());
    }
}
