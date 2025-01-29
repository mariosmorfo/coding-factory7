package gr.aueb.cf.homework.model_shape_2;

public class Circle extends AbstractShape implements ICircle, ITwoDimensional  {

    private double radius;

    public Circle(){

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(long id, double radius) {
        super(id);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getDiameter() {
        return radius * 2;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public long getCircumference() {
        return Math.round(2 * Math.PI * radius);
    }

    @Override
    public String toString() {
        return "Circle with id:"+ getId() + " has radius is:" + radius;
    }
}
