package gr.aueb.cf.homework.model_shape;

import java.io.Serializable;
import java.util.Objects;

public class Line extends AbstractShape implements Serializable, Cloneable {

    private double length;
    private static final long serialVersionUID= 3L;

    public Line(){

    }

    @Override
    protected Line clone() throws CloneNotSupportedException {
        return (Line) super.clone();
    }

    public Line(Line line){
        this.length = line.length;
    }

    public Line(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length <= 0) {
            throw new IllegalArgumentException("Length must be positive");
        }
        this.length = length;
    }


    @Override
    public long getId() {
        return super.getId();
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
    public String toString() {
        return "Line id: "+ getId() + " length: " + length;
    }
}
