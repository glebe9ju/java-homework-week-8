package HomeWork_8;

import javafx.scene.shape.Circle;

public class P19Cylinder extends P19Circle {
     double height;

    public P19Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        if (height > 0) {
            return height;
        } else {
            height = 0;
            return height;
        }
    }
public double getVolume(){
        double area = getArea()* getHeight();
        return area;
}

}
