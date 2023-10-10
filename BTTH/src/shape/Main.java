package shape;

public class Main {
    public static void main(String[] args) {
        System.out.println("----- Shape -----");
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("red", false);
        System.out.println(shape);
        System.out.println("                 ");
        System.out.println("----- Circle -----");
        Circle circle=new Circle();
        System.out.println(circle);
        circle=new Circle(3.5);
        System.out.println(circle);
        circle=new Circle("red",false,3.5);
        System.out.println(circle);
        System.out.println("                 ");
        System.out.println("----- Rectangle -----");
        Rectangle rec=new Rectangle();
        System.out.println(rec);
        rec=new Rectangle(2.3,5.8);
        System.out.println(rec);
        rec=new Rectangle("orange",true,2.5,3.8);
        System.out.println(rec);
        System.out.println("                 ");
        System.out.println("----- Square -----");
        Square sq=new Square();
        System.out.println(sq);
        sq=new Square(5.8);
        System.out.println(sq);
        sq=new Square("Blue",true,3.5);
        System.out.println(sq);
    }
}
