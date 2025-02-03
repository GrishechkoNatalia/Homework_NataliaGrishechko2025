public class Rectangle implements Shape {
    private double width;
    private double height;
    private String shapeColor;
    private String fillColor;
    public Rectangle(double width, double height, String shapeColor, String fillColor) {
        this.width = width;
        this.height = height;
        this.shapeColor = shapeColor;
        this.fillColor = fillColor;
    }

    @Override
    public double getPerimeter() {
        return (double) (2 * (width + height));
    }

    @Override
    public double getSquare() {
        return (double) (width * height);
    }

    public void printShapeColor() {
        System.out.println(shapeColor);
    }

    public void printFillColor() {
        System.out.println(fillColor);
    }
}
