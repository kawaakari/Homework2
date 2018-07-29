package figures;

public abstract class ShapeUtils {

    private Figure figure;

    public static boolean isRectangle(Figure figure) {
        return figure instanceof Rectangle;
    }

    public static boolean isTriangle(Figure figure) {
        return figure instanceof RightTriangle;
    }
}
