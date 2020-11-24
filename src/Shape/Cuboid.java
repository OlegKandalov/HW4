package Shape;

public class Cuboid extends SpaceShape {
    Vertex3D pointA;
    double width;
    double height;
    double depth;

    public Cuboid(Vertex3D pointA, double width, double height, double depth){
        vertices.add(pointA);
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.pointA = pointA;
    }

    @Override
    public double getArea() {
        return 2 * ((width * height) + (height * depth) + (width * depth));
    }

    @Override
    public double getVolume() {
        return width * height * depth;
    }

    @Override
    public String toString() {
        return "Shape.Shape type - Shape.Cuboid" +
                System.lineSeparator() + "coordinates: " + pointA +
                System.lineSeparator() + "width - " + width +
                System.lineSeparator() + "height - " + height +
                System.lineSeparator() + "depth - " + depth +
                System.lineSeparator() + "volume: " + getVolume() +
                System.lineSeparator() + "area: " + getArea() +
                System.lineSeparator();
    }
}
