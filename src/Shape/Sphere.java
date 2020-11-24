package Shape;

public class Sphere extends SpaceShape {
    Vertex3D pointA;
    double radius;

    public Sphere(Vertex3D pointA, double radius){
        vertices.add(pointA);
        this.pointA = pointA;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (4 * Math.PI) * Math.pow(radius,2);
    }

    @Override
    public double getVolume() {
        return (4 * Math.PI * (Math.pow(radius,3))) / 3;
    }

    @Override
    public String toString() {
        return "Shape.Shape type - Shape.Sphere" +
                System.lineSeparator() + "coordinates: " + pointA +
                System.lineSeparator() + "radius - " + radius +
                System.lineSeparator() + "volume: " + getVolume() +
                System.lineSeparator() + "area: " + getArea() +
                System.lineSeparator();
    }
}
