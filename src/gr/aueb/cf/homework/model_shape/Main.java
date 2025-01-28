package gr.aueb.cf.homework.model_shape;


import java.io.*;

public class Main {
    public static void main(String[] args) {

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/tmp/shapes.txt"))){
            Circle circle = new Circle(5);
            circle.setId(1);
            System.out.println(circle);

            Rectangle rectangle = new Rectangle(4, 5);
            rectangle.setId(2);
            System.out.println(rectangle);

            Line line = new Line(1);
            line.setId(3);
            System.out.println(line);

            oos.writeObject(circle);
            oos.writeObject(rectangle);
            oos.writeObject(line);


        }catch (IOException e){
            System.err.println();
        }
    }

}
