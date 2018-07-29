package figures;

public class RightTriangle extends Figure {

    private int sideA;
    private int sideB;

    public RightTriangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        return sideA * sideB / 2;
    }

    @Override
    public String toString() {
        return "Right Triangle: Side A = " + sideA + " Side B = " +
                sideB + " Area = " + calculateArea();
    }

    @Override
    public boolean isAreaEqualTo(Figure figure) {
        return calculateArea() == figure.calculateArea();
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }
}
