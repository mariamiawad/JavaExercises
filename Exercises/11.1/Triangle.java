import java.util.*;
public class Triangle extends GeometricObject {
        double side1;
        double side2;
        double side3;
        boolean isFilled;
        String color;
        public  Triangle(){
                this.side1=1;
                this.side2=1;
                this.side3=1;
        }
        public Triangle(double side1, double side2, double side3){
                this.side1 = side1;
                this.side2 = side2;
                this.side3 = side3;
                isValidTriangle();       
        }
        
        public double getSide1() {
                return side1;
        }
        
        public double getSide2() {
                return side2;

        }
        
        public double getSide3() {
                return side3;
        }
        
        public void setSide1(double side1) {
                this.side1 = side1;
                isValidTriangle();
        
        }
        
        public void setSide2(double side2) {
                this.side2= side2;
                isValidTriangle();
        }

        
        public void setSide3(double side3) {
                this.side3 = side3;
                isValidTriangle();
        }
        
        public double getArea() {
         double s = side1+side2+side3;
         return Math.pow((s*(s-side1)*(s-side2)*(s-side3)), 0.5);
        }
        
        public double getPerimeter() {
                return side1+side2+side3;
        }
        @Override
        public String toString() {
        return "Triangle: side1=" + getSide1() + " side2 = " +getSide2() + " side3="+getSide3();
        }
        public boolean isTriangle(double side1, double side2, double side3){
                return (side1 + side2 > side3 ) && (side2 + side3 > side1) && (side1 + side3 > side2 ) ;

        }
        
        public void isValidTriangle() throws IllegalArgumentException{
                
                        
                        if (!isTriangle(side1, side2, side3))
                        throw new IllegalArgumentException();
                
        }
        @Override
        public void setIsFilled( boolean isFilled){
                this.isFilled = isFilled;
        }
        @Override
        public boolean getIsFilled(){
                return isFilled;
        }
        @Override
        public void setColor (String color){
                this.color = color;
        }
        @Override
        public String getColor(){
                return color;
        }
}