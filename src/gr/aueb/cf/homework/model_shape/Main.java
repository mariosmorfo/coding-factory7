package gr.aueb.cf.homework.model_shape;


import java.io.*;

public class Main {
    public static void main(String[] args) {

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/tmp/shapes.txt"))){


            Circle circle = new Circle(5);
            circle.setId(1);

            Circle clonedCircle = circle.clone();
            clonedCircle.setId(2);

            System.out.println(circle);
            System.out.println(clonedCircle);


            Rectangle rectangle = new Rectangle(4, 5);
            rectangle.setId(2);

            Rectangle clonedRectangle = rectangle.clone();
            clonedRectangle.setHeight(10);
            clonedRectangle.setWidth(10);
            System.out.println(rectangle);
            System.out.println(clonedRectangle);



            Line line = new Line(1);
            line.setId(3);

            Line clonedLine = line.clone();
            clonedLine.setLength(100);

            System.out.println(line);
            System.out.println(clonedLine);

            oos.writeObject(circle);
            oos.writeObject(rectangle);
            oos.writeObject(line);



        }catch (IOException e){
            System.err.println(e.getMessage());


        }catch (CloneNotSupportedException e){
            System.out.println("Cloning not supported" + e.getMessage());
        }



    }

}
