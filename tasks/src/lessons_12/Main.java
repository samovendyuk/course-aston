package lessons_12;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        circle.setFillColor("Green");
        circle.setBorderColor("Yellow");
        circle.printCircle();

        Triangle triangle = new Triangle(2, 4, 6);
        triangle.setFillColor("Black");
        triangle.setBorderColor("Red");
        triangle.printCircle();

        Rectangle rectangle = new Rectangle(10, 20);
        rectangle.setFillColor("Blue");
        rectangle.setBorderColor("Purple");
        rectangle.printCircle();
    }
}
