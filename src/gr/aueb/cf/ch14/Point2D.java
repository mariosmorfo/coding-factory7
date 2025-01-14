package gr.aueb.cf.ch14;

public class Point2D extends Point{
    private double y;

    public Point2D(){
        super(); // Calls default constructor of Point
        y = 0;
    }

    public Point2D(double x, double y) {
        super(x); // Calls overloaded constructor
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

//    @Override
//    public String pointToString() {
//        return super.pointToString();
//    }


    @Override
    public String toString() {
        return super.toString() + "(" + y + ')';
    }

    @Override
    public void movePlus10() {
        super.movePlus10();
    }

    @Override
    protected void movePlusOne() {
        super.movePlusOne();
    }
}
