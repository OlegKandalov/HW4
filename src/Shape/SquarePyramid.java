package Shape;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class SquarePyramid extends SpaceShape {
    double width;
    double height;
    Vertex3D pointA;

    public SquarePyramid(Vertex3D pointA, double width, double height){
        vertices.add(pointA);
        this.width = width;
        this.height = height;
        this.pointA = pointA;
    }

    @Override
    public double getArea() {
        return pow(width,2) + width * sqrt((4 * (pow(height,2))) + pow(width,2));
    }

    @Override
    public double getVolume() {
        return (pow(width,2) * height) / 3;
    }

    @Override
    public String toString() {
        return "Shape.Shape type - Square Pyramid" +
                System.lineSeparator() + "coordinates: " + pointA +
                System.lineSeparator() + "width - " + width +
                System.lineSeparator() + "height - " + height +
                System.lineSeparator() + "volume: : " + getVolume() +
                System.lineSeparator() + "area: " + getArea() +
                System.lineSeparator();
    }
}
