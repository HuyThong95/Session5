import java.util.Scanner;

public class CreatShape {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle();
        shapes[1] = new RectAngle();

        for (Shape shape : shapes){

            if (shape instanceof Circle){
                ChangeShape changeShape = (Circle) shape;
                ((Circle) shape).setRadius(5);
                System.out.println("hinh tron mac dinh la" + changeShape.toString());
                double sc;
                Scanner scanner = new Scanner(System.in);
                System.out.println(" nhap % thay doi : ");
                sc = scanner.nextDouble();
                changeShape.resize(sc);
                System.out.println("hinh tron sau khi thay doi la " + shape);
                System.out.println(changeShape.howToColor());

            } else if ( shape instanceof RectAngle){
                ChangeShape changeShape = (RectAngle) shape;
                ((RectAngle) shape).setLenght(4);
                ((RectAngle) shape).setWidth(2);
                System.out.println("hinh chu nhat mac dinh la " + changeShape.toString());
                double sc;
                Scanner scanner = new Scanner(System.in);
                System.out.println(" nhap % thay doi : ");
                sc = scanner.nextDouble();
                changeShape.resize(sc);
                System.out.println("hinh chu nhat sau khi thay doi la " +shape);
                System.out.println(changeShape.howToColor());
            }
        }
    }
}

