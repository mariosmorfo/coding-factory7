package gr.aueb.cf.homework;

public class PointΧΥΖ {
    int x;
    int y;
    int z;

    public PointΧΥΖ() {

    }

    public PointΧΥΖ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public String pointToString() {
        return "(" + x + "," + y + "," + z + ")";
    }

    public double getXYDistance(){
        return (x * x + y * y);
    }

    public double getYZDistance(){
        return (y * y + z * z);
    }

    public double getXZDistance(){
        return (x * x + z * z);
    }

    public double getXYZDistance(){
        return (x * x + y * y + z * z);
    }

}

