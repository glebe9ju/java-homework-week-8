package HomeWork_8;

public class P20Cuboid extends P20Rectangle {
    double height;

    public P20Cuboid(double width, double length, double height) {
        super(width, length);
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }
    public double getHeight(){
        return height;
    }
    public double getVolume(){
        return (getArea() * height);
    }
}
