import java.util.Scanner;
class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calcPerimeter() {
        return 2 * (length + width);
    }

    public double calcArea() {
        return length * width;
    }
}

 class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
}

class UML{
public static void main(String[] args) {
Scanner myScanner=new Scanner(System.in);
System.out.print("请输入长方体长和宽：");
double l=myScanner.nextDouble();
double w=myScanner.nextDouble();
Rectangle rectangle = new Rectangle(l, w);
System.out.println("长方形周长："+rectangle.calcPerimeter());
System.out.println("长方形周长："+rectangle.calcArea()); 
System.out.print("请输入正方体边长：");
double s=myScanner.nextDouble();
Square square = new Square(s);
System.out.println("正方形周长："+square.calcPerimeter()); 
System.out.println("正方形面积："+square.calcArea()); 
myScanner.close();
}
}