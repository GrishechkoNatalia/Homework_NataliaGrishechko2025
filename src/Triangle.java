public class Triangle implements Shape {
    private double height;
    private double a, b, c;
    private String shapeColor;
    private String fillColor;
    public Triangle(double a, double b, double c, double height, String shapeColor, String fillColor) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.shapeColor = shapeColor;
        this.fillColor = fillColor;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return (double) (a + b + c);
    }

    @Override
    public double getSquare() {
        return (double) (0.5 * b * height);
    }

    public void printShapeColor() {
        System.out.println(shapeColor);
    }

    public void printFillColor() {
        System.out.println(fillColor);
    }
}
