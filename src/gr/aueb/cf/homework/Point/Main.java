package gr.aueb.cf.homework.Point;



public class Main {
    public static void main(String[] args) {

        PointΧΥΖ point = new PointΧΥΖ(3,4,5);

        System.out.println("Point: " + point.pointToString());

        double xyDistance = point.getXYDistance();
        double xzDistance = point.getXZDistance();
        double yzDistance = point.getYZDistance();
        double xyzDistance = point.getXYZDistance();

        System.out.println("XY Distance: "+ xyDistance);
        System.out.println("XZ Distance: "+ xzDistance);
        System.out.println("YZ Distance: "+ yzDistance);
        System.out.println("XYZ Distance: "+ xyzDistance);


}
}
