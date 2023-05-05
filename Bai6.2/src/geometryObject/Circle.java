package geometryObject;

public class Circle {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
    public double getArea() {
        System.out.println(" DienTichLa:" + 3.14 * radius * radius);
        return getArea();
    }
    public double getPerimeter() {
        System.out.println(" ChuViLa:" + radius * 2 * 3.14);
        return getPerimeter();
    }
}
