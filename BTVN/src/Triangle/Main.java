package Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập độ dài 3 cạnh của tam giác: ");
            System.out.println("Nhập cạnh 1: ");
            double side1 = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhập cạnh 2: ");
            double side2 = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhập cạnh 3: ");
            double side3 = Double.parseDouble(scanner.nextLine());
            if (!(side1 + side2 > side3 && side2 + side3 > side1 && side3 + side2 > side1)) {
                System.out.println("Không đủ điều kiện tạo thành 1 tam giác. Mời nhập lại: ");
            } else {
                System.out.println("Nhập màu sắc của tam giác: ");
                String color = scanner.nextLine();
                Triangle triangle = new Triangle(side1,side2,side3);
                System.out.println(triangle.toString(color));
                break;
            }
        }

    }
}
