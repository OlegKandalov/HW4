package Shape;

public class Rectangle extends PlaneShape {
    double wight;
    double height;
    Vertex pointA;

    public Rectangle(Vertex pointA, double wight, double height){
        vertices.add(pointA);
        this.wight = wight;
        this.height = height;
        this.pointA = pointA;
    }

    @Override
    public double getPerimeter() {
        return (wight + height) * 2;
    }

    @Override
    public double getArea() {
        return wight * height;
    }

    @Override
    public String toString() {
        return "Shape.Shape type - Shape.Rectangle" +
                System.lineSeparator() + "coordinates: " + pointA +
                System.lineSeparator() + "wight - " + wight + ", height - " + height +
                System.lineSeparator() + "perimeter: " + getPerimeter() +
                System.lineSeparator() + "area: " + getArea() +
                System.lineSeparator();
    }
}
