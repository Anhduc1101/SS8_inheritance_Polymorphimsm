package CircleVsCylinder;

public class Cylinder extends Circle{
    public double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calVolume(){
        return calArea()*this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + super.getRadius() +
                ", color='" + super.getColor() +'\''+
                ", height='" + getHeight() +'\''+
                ", volume='" + calVolume() +'\''+
                '}';
    }
}
