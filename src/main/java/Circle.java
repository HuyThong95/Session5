public class Circle extends Shape implements ChangeShape {
    private double radius;


    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }


    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;

    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public void resize(double percent){
        radius = radius * percent / 100;
    }

    public String howToColor(){
        return " hinh tron mau do ";
    }

    public String toString(){
        return " hinh tron co ban kinh : " + getRadius() + " " +
                " co dien tich la : " + getArea() + " " +
                " co chu vi la : " + getPerimeter();
    }




}
