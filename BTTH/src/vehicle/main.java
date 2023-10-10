package vehicle;

public class main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "white");
        Car car2 = new Car("Honda", "black");
        System.out.println("Thương hiệu của xe ô tô thứ nhất là: " + car1.getBrand());
        car1.setColor("yellow");
        System.out.println("Màu của xe thứ nhất sau khi được đổi là: " + car1.getColor());
        System.out.println("Xe ô tô thứ 1: "+car1.toString());
        System.out.println("Xe ô tô thứ 2: "+car2.toString());
        System.out.println("                               ");
        Motorcycle bike1 = new Motorcycle("Honda", "blue");
        Motorcycle bike2 = new Motorcycle("Harley", "black");
        System.out.println("Xe máy thứ 1: " + bike1.toString());
        System.out.println("Xe máy thứ 2: " + bike2.toString());
    }

}
