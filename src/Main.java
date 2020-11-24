import Shape.*;

public class Main {
    public static void main(String[] args) {
        Vertex p1 = new Vertex(3,2);
        Vertex p2 = new Vertex(4,2);
        Vertex p3 = new Vertex(5,6);

        Vertex3D point1 = new Vertex3D(3,6,8);
        Vertex3D point2 = new Vertex3D(4,12,9);

        Triangle triangle = new Triangle(p1,p2,p3);
        Rectangle rectangle = new Rectangle(p1,4,7);
        Circle circle = new Circle(p2,6);

        SquarePyramid sq = new SquarePyramid(point1,12,3);
        Cuboid cuboid = new Cuboid(point2,3,4,5);
        Sphere sphere = new Sphere(point1,14);


        Shape[] shapes = new Shape[6];
        shapes[0] = triangle;
        shapes[1] = rectangle;
        shapes[2] = circle;
        shapes[3] = sq;
        shapes[4] = cuboid;
        shapes[5] = sphere;

        for (Shape s : shapes){
            System.out.println(s);
        }
    }
}
