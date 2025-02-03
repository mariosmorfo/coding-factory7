package gr.aueb.cf.homework.model_shape_2;

import java.io.Serializable;
import java.util.Objects;

public class Rectangle extends AbstractShape implements IRectangle, ITwoDimensional, IShape, Serializable, Cloneable {

    private double width;
    private double height;
    private static final long serialVersionUID = 1L;

    public Rectangle(){

    }

    public Rectangle(Rectangle rectangle){
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(long id, double width, double height) {
        super(id);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width < 0) {
            throw new IllegalArgumentException("Width cannot be negative");
        }

        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height < 0) {
            throw new IllegalArgumentException("Height cannot be negative");
        }
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public long getCircumference() {
        return Math.round(2 * (width + height));
    }

    @Override
    public String toString() {
        return "Rectangle with id:" + getId() + " has width:" + width + " and height:" + height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle rectangle)) return false;
        return Double.compare(getWidth(), rectangle.getWidth()) == 0 && Double.compare(getHeight(), rectangle.getHeight()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWidth(), getHeight());
    }

    @Override
    protected Rectangle clone() throws CloneNotSupportedException {
        return (Rectangle) super.clone();
    }
}
