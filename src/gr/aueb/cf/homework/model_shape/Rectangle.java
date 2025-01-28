package gr.aueb.cf.homework.model_shape;

import java.io.Serializable;
import java.util.Objects;

public class Rectangle extends AbstractShape implements ITwoDimensional, Serializable {

  private double width;
  private double height;

  private static final long  serialVersionUID = 2L;

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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle id: "+ getId() + " width: " + width + " height: " + height;
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


}
