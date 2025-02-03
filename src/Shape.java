public interface Shape {
    default double getSquare() {
        return 0.0;
    }

    default double getPerimeter() {
        return 0.0;
    }

    default void printSquare() {
        System.out.println(getSquare());
    }

    default void printPerimeter() {
        System.out.println(getPerimeter());
    }

    void printShapeColor();

    void printFillColor();
}
