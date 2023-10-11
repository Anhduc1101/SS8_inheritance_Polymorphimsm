package PointVsMovablePoint;

public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point.toString());
        MovablePoint movablePoint = new MovablePoint(5.5f,4.5f);
        System.out.println(movablePoint.toString());
        System.out.println(movablePoint.move());
    }
}
