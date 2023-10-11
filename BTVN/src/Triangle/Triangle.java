package Triangle;

public class Triangle extends Shape {
    private double side1 = 1;
    private double side2 = 1;
    private double side3 = 1;

    public Triangle() {
    }
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getPerimeter(){
        return getSide3()+getSide2()+getSide1();
    }
    public double getHalfPerimeter(){
        return getPerimeter()/2;
    }
    public double getArea(){
        return Math.sqrt(getHalfPerimeter()*(getHalfPerimeter()-side1)*(getHalfPerimeter()-side2)*(getHalfPerimeter()-side3));
    }

    @Override
    public String toString(String color) {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", color=" + color +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                '}';
    }
}
