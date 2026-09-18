class Shape {
void display() {
System.out.println("This is a shape.");
}
}
class Circle extends Shape {
double radius;
Circle(double radius) {
this.radius = radius;
}
void calculateArea() {
double area = Math.PI * radius * radius;
System.out.println("Area of Circle: " + area);
}
}
class Rectangle extends Shape {
double length;
double width;
Rectangle(double length, double width) {
this.length = length;
this.width = width;
}
void calculateArea() {
double area = length * width;
System.out.println("Area of Rectangle: " + area);
}
}
public class Main {
public static void main(String[] args) {
Circle c = new Circle(5);
Rectangle r = new Rectangle(10, 6);
c.display();
c.calculateArea();
r.display();
r.calculateArea();
}
}
/* This is a shape.
Area of Circle: 78.53981633974483
This is a shape.
Area of Rectange:60.0 */
