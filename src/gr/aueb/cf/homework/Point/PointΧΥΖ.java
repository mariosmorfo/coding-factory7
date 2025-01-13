package gr.aueb.cf.homework.Point;

public class PointΧΥΖ {

    private double x;
    private double y;
    private double z;

    public PointΧΥΖ(){

    }

    public PointΧΥΖ(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public String pointToString() {
        return "(" + x + "," + y + "," + z + ")";
    }

    public double getXYDistance(){
        return Math.sqrt(x * x + y * y);
    }

    public double getYZDistance(){
        return Math.sqrt(y * y + z * z);
    }

    public double getXZDistance(){
        return Math.sqrt(x * x + z * z);
    }

    public double getXYZDistance(){
        return Math.sqrt(x * x + y * y + z * z);
    }

}

