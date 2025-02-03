public class Circle implements Shape {
    private double radius;
    private String shapeColor;
    private String fillColor;

    public Circle(double radius, String shapeColor, String fillColor) {
        this.radius = radius;
        this.shapeColor = shapeColor;
        this.fillColor = fillColor;
    }

    @Override
    public double getPerimeter() {
        return (double) (2 * Math.PI * radius);
    }

    @Override
    public double getSquare() {
        return (double) (Math.PI * radius * radius);
    }

    public void printShapeColor() {
        System.out.println(shapeColor);
    }

    public void printFillColor() {
        System.out.println(fillColor);
    }
}
