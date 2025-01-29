package gr.aueb.cf.homework.model_shape_2;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/tmp/shapes2.txt")))
        {

            Circle circle = new Circle(10);
            circle.setId(1);
            System.out.println(circle);

            Rectangle rectangle = new Rectangle(10, 10);
            rectangle.setId(2);
            System.out.println(rectangle);

            Line line = new Line(10);
            line.setId(3);
            System.out.println(line);

            oos.writeObject(circle);
            oos.writeObject(rectangle);
            oos.writeObject(line);

            System.out.println("Shapes have been serialized");
        }catch (IOException e){
            System.err.println();
        }


    }
}
