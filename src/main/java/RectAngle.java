
public class RectAngle extends Shape implements ChangeShape {
    private double width;
    private double lenght;

    public RectAngle(){

    }

    public RectAngle(double width, double lenght){
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth(){
        return this.width;
    }

    public void setWidth( double width){
        this.width = width;
    }

    public double getLenght(){
        return this.lenght;
    }

    public void setLenght( double lenght){
        this.lenght = lenght;
    }

    public double getArea(){
        return width * lenght;
    }

    public double getPerimeter(){
        return ( width + lenght ) * 2;
    }

    public String howToColor(){
        return "hinh chu nhat mau xanh";
    }

    public void resize( double percent){
           width = width * percent / 100;
           lenght = lenght * percent / 100;
    }

    public String toString(){
        return "hinh chu nhat co chieu dai hai canh lan luot la : " + getLenght() + " " + getWidth() +
                " co dien tich la : " + getArea() +
                " co chu vi la : " + getPerimeter();
    }



}
