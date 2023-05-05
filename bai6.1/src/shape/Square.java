package shape;

public class Square extends Rectangle {
    protected  double side;
    public Square() {

    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color,boolean filled ){
        this.side = side;
        this.color = color;
        this.filled = filled;

    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}