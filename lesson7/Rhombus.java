package figures;

public class Rhombus extends Figure implements FindPerimeter {

    private int side;
    private int height;

    public Rhombus(int side, int height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return side * height;
    }

    @Override
    public int calculatePerimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Rhombus: Side = " + side + " Height = " + height +
                " Area = " + calculateArea() + " Perimeter = " +
                calculatePerimeter();
    }

    @Override
    public boolean isAreaEqualTo(Figure figure) {
        return calculateArea() == figure.calculateArea();
    }

    public int getSide() {
        return side;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setSide(int side) {
        this.side = side;
    }

}
