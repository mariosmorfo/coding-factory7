package gr.aueb.cf.homework.model_shape_2;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(10);
        circle.setId(1);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle(10, 10);
        rectangle.setId(2);
        System.out.println(rectangle);

        Line line = new Line(10);
        line.setId(3);
        System.out.println(line);

    }
}
