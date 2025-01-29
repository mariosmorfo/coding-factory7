package gr.aueb.cf.homework.model_shape_2;

import java.io.Serializable;
import java.util.Objects;

public class Circle extends AbstractShape implements ICircle, ITwoDimensional, Serializable, Cloneable {

    private double radius;
    private static final long serialVersionUID = 1L;

    public Circle(){

    }

    public Circle (Circle circle){
        this.radius = circle.radius;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle circle)) return false;
        return Double.compare(getRadius(), circle.getRadius()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getRadius());
    }

    @Override
    protected Circle clone() throws CloneNotSupportedException {
        return (Circle) super.clone();
    }
}
