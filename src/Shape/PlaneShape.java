package Shape;

import static java.lang.Math.*;

public abstract class PlaneShape extends Shape implements AreaMeasurable, PerimeterMeasurable{

     static double getDistance(Vertex pointA, Vertex pointB){
        return sqrt(pow((pointA.x - pointB.x),2) + pow((pointA.y - pointB.y),2));
    }
}

