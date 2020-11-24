package Shape;

import static java.lang.Math.*;

public class Circle extends PlaneShape{
    Vertex pointA;
    double radius;

    public Circle(Vertex pointA, double radius){
        vertices.add(pointA);
        this.pointA = pointA;
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return (2 * PI) * radius;
    }

    @Override
    public double getArea() {
        return PI * pow(radius,2);
    }

    @Override
    public String toString() {
        return "Shape.Shape type - Shape.Circle" +
                System.lineSeparator() + "coordinates: " + pointA +
                System.lineSeparator() + "radius - " + radius +
                System.lineSeparator() + "perimeter: " + getPerimeter() +
                System.lineSeparator() + "area: " + getArea() +
                System.lineSeparator();
    }
}
