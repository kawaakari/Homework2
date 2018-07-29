package figures;

public class Parallelogram extends Figure {

    private int side;
    private int height;

    public Parallelogram(int side, int height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return side * height;
    }

    @Override
    public String toString() {
        return "Parallelogram: Side = " + side + " Height = " +
                height + " Area = " + calculateArea();
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

    public void setSide(int side) {
        this.side = side;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
