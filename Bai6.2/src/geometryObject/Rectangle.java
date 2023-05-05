package geometryObject;

public class Rectangle {
    public double width;
    public double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
    public double getArea() {
        System.out.println(" DienTichLa:" + width * length);
        return getArea();
    }
    public double getPerimeter() {
        System.out.println(" ChuViLa:" + (width + length)* 2);
        return getPerimeter();
}
