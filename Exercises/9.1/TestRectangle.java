import java.util.*;
public class TestRectangle{
    public static void main (String[] args){
        Rectangle rectangle = new Rectangle(4,40);
        double area =rectangle.getArea();
        double perimeter = rectangle.getPerimeter();
        System.out.println("The area of a rectangle with width 4 and height 40 is "+ area);
        System.out.println("The perimeter of a rectangle with width 4 and height 40 is "+ perimeter);
        rectangle = new Rectangle(3.5, 35.9);
        area = rectangle.getArea();
        perimeter = rectangle.getPerimeter();
        System.out.println("The area of a rectangle with width 3.5 and height 35.9 is "+ area);
        System.out.println("The perimeter of a rectangle with width 3.5 and height 35.9 is "+ perimeter);
        



    }
}