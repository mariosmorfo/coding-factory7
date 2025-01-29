package gr.aueb.cf.homework.model_shape_2;

public class Line extends AbstractShape implements ILine, IShape{

    private double length;

    public Line(){

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
}
