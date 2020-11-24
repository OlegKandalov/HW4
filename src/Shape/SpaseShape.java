package Shape;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

abstract class SpaceShape extends Shape implements VolumeMeasurable, AreaMeasurable{

    static double getDistance(Vertex3D pointA, Vertex3D pointB){
        return sqrt(pow((pointA.x - pointB.x),2) + pow((pointA.y - pointB.y),2) + pow((pointA.z - pointB.z),2));
    }
}
