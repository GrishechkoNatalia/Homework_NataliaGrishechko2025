import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // #1
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Гуся");
        cats[1] = new Cat("Мартин");
        cats[2] = new Cat("Алиса");

        Bowl bowl = new Bowl(10);
        for(int i = 0; i < cats.length; i++) {
            cats[i].eat(bowl);

            if(cats[i].isFed) {
                System.out.println("Кот " + cats[i].name + " сытый.");
            } else {
                System.out.println("Кот " + cats[i].name + " голодный.");
            }
        }

        // #2
        Shape triangle = new Triangle(6,3,6,5,"red", "cyan");
        Shape rectangle = new Rectangle(5,3,"blue","magenta");
        Shape circle = new Circle(4,"orange","green");

        circle.printPerimeter();
        circle.printSquare();
        circle.printShapeColor();
        circle.printFillColor();

        rectangle.printPerimeter();
        rectangle.printSquare();
        rectangle.printShapeColor();
        rectangle.printFillColor();

        triangle.printPerimeter();
        triangle.printSquare();
        triangle.printShapeColor();
        triangle.printFillColor();
    }
}
