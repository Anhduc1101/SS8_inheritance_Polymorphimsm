package Point2DVsPoint3D;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point2D p2d = new Point2D(4.5f, 5.5f);
        System.out.println(p2d.toString());
        Point3D p3d = new Point3D();
        System.out.println(Arrays.toString(p3d.getXYZ()));
    }
}
