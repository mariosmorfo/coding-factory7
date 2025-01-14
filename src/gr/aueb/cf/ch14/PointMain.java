package gr.aueb.cf.ch14;

public class PointMain {
    public static void main(String[] args) {
//        Point point = new Point();
//        Point point2D = new Point2D();
//        Point point3D = new Point3D();
//
//        doMovePlus10(point);
//        doMovePlus10(point2D);
//        doMovePlus10(point3D);

        Point p1 = new Point();
        Point p2 = new Point2D();
        Point p3 = new Point3D();

        p2.movePlusOne();
        p1.movePlus10();

        p3.movePlusOne();

        ((Point2D) p2).setX(15);
    }

    public static void doMovePlus10(Point point){
        point.movePlus10();
    }
}
