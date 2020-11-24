package Shape;

import static java.lang.Math.sqrt;

public class Triangle extends PlaneShape {
    private double a;
    private double b;
    private double c;
    private double pol;

    Vertex pointA;
    Vertex pointB;
    Vertex pointC;


   public Triangle(Vertex pointA, Vertex pointB, Vertex pointC){
       vertices.add(pointA);
       vertices.add(pointB);
       vertices.add(pointC);

       this.pointA = pointA;
       this.pointB = pointB;
       this.pointC = pointC;

       a = PlaneShape.getDistance(pointA, pointB);
       b = PlaneShape.getDistance(pointB, pointC);
       c = PlaneShape.getDistance(pointA, pointC);
       pol = (a + b + c) / 2;
   }


    @Override
    public double getPerimeter() {
        return  a + b + c;
    }

    @Override
    public double getArea() {
        return sqrt(pol * (pol - a) * (pol - b) * (pol - c));
    }

    @Override
    public String toString() {
        return "Shape.Shape type - Shape.Triangle" +
                System.lineSeparator() + "coordinates: " + pointA + ", " + pointB + ", " + pointC +
                System.lineSeparator() + "perimetr: " + getPerimeter() +
                System.lineSeparator() + "area: " + getArea() +
                System.lineSeparator();
    }
}
