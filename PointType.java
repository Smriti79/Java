package dsaAssignmentTwo;
class PointType {
double x; 
double y;
public PointType(double x, double y) {
this.x = x;
this.y = y;
}
public void setCoordinates(double x, double y) {
this.x = x;
this.y = y;
}
public void printCoordinates() {
System.out.println("(" + x + ", " + y + ")");
}
public double getX() {
return x;
}
public double getY() {
return y;
}
}
class CircleType extends PointType {
private double radius; 
public CircleType(double x, double y, double radius) {
super(x, y); 
this.radius = radius;
}
public void setRadius(double radius) {
this.radius = radius;
}
public void printRadius() {
System.out.println(radius);
}
public void printArea() {
double area = Math.PI * radius * radius;
System.out.println(area);
}
public void printCircumference() {
double circumference = 2 * Math.PI * radius;
System.out.println(circumference);
}
}
public class Circle {
public static void main(String[] args) {
CircleType circle = new CircleType(3, 4, 5);
System.out.print("Center of the circle: ");
circle.printCoordinates();
System.out.print("Radius of the circle: ");
circle.printRadius();
System.out.print("Area of the circle: ");
circle.printArea();
System.out.print("Circumference of the circle: ");
circle.printCircumference();
circle.setRadius(10);
System.out.print("New radius of the circle: ");
circle.printRadius();

	}

}
