package figures;

public class Rectangle extends Figure implements FindPerimeter {

    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        return sideA * sideB;
    }

    public double calculateDiagonal() {
        return Math.sqrt(Math.pow(getSideA(), 2d) + Math.pow(getSideB(), 2d));
    }

    @Override
    public int calculatePerimeter() {
        return (sideA + sideB) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle: Side A = " +
                sideA + " Side B = " + sideB + " Diagonal = " +
                calculateDiagonal() + " Area = " + calculateArea();
    }

    @Override
    public boolean isAreaEqualTo(Figure figure) {
        return calculateArea() == figure.calculateArea();
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }
}
