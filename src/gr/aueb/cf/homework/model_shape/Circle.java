package gr.aueb.cf.homework.model_shape;

import java.io.Serializable;
import java.util.Objects;

public class Circle extends AbstractShape implements ITwoDimensional, Serializable {

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

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle id: " + getId() + " radius: " + radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
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
}
