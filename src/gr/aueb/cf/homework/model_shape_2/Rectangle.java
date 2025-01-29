package gr.aueb.cf.homework.model_shape_2;

public class Rectangle extends AbstractShape implements IRectangle, ITwoDimensional,IShape{

    private double width;
    private double height;

    public Rectangle(){

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
}
