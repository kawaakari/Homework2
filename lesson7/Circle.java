package figures;

public class Circle extends Figure {

    private int radius;
    private final double PI = 3.14;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle: Radius = " + radius + " Area = " + calculateArea();
    }

    @Override
    public boolean isAreaEqualTo(Figure figure) {
        return calculateArea() == figure.calculateArea();
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
