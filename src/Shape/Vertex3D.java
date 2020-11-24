package Shape;

public class Vertex3D extends Vertex {
    int z;

    public Vertex3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + "," + z + ")";
    }
}
