package ra.bt2;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(3, 2);
        System.out.println("Point2D: " + point2D);
        System.out.println("X: " + point2D.getX());
        System.out.println("Y: " + point2D.getY());

        point2D.setX(5);
        point2D.setY(4);
        System.out.println(" Point2D: " + point2D);


        Point3D point3D = new Point3D(3, 2, 1);
        System.out.println("Point3D: " + point3D);
        System.out.println("X: " + point3D.getX());
        System.out.println("Y: " + point3D.getY());
        System.out.println("Z: " + point3D.getZ());

        point3D.setX(5);
        point3D.setY(4);
        point3D.setZ(2);
        System.out.println(" Point3D: " + point3D);
    }
}
