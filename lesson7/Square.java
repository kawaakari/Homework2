package figures;

public class Square extends Figure implements FindPerimeter {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public int calculatePerimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square: Side = " +
                side + " Diagonal = " + calculateDiagonal() + " Area = " +
                calculateArea() + " Perimeter = " + calculatePerimeter();
    }

    @Override
    public boolean isAreaEqualTo(Figure figure) {
        return calculateArea() == figure.calculateArea();
    }

    public double calculateDiagonal() {
        return Math.sqrt(2d) * side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
