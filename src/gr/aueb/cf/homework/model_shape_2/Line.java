package gr.aueb.cf.homework.model_shape_2;

import java.io.Serializable;
import java.util.Objects;

public class Line extends AbstractShape implements ILine, IShape, Serializable, Cloneable  {

    private double length;

    private static final long serialVersionUID = 1L;

    public Line(){

    }

    public Line (Line line){
        this.length = line.length;
    }

    public Line(double length) {
        if(length < 0) {
            throw new IllegalArgumentException("Length cannot be negative");
        }
        this.length = length;
    }

    public Line(long id, double length) {
        super(id);

        if(length < 0){
            throw new IllegalArgumentException("Length cannot be negative");
        }
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Line with id:" + getId() + " has length:" + length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Line line)) return false;
        return Double.compare(getLength(), line.getLength()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getLength());
    }

    @Override
    protected Line clone() throws CloneNotSupportedException {
        return (Line )super.clone();
    }
}
