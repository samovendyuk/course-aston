package lessons_12;

public class Triangle implements Shape, Borderable, Fillable {

    private double sideOne;
    private double sideTwo;
    private double sideThree;
    private String fillColor;
    private String borderColor;

    public  Triangle (double sideOne, double sideTwo, double sideThree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }
    @Override
    public void setBorderColor(String color) {
        this.borderColor = color;
    }

    @Override
    public void setFillColor(String color) {
        this.fillColor = color;
    }

    @Override
    public double calculatePerimeter() {
        return sideOne + sideTwo + sideThree;
    }

    @Override
    public double calculateArea() {
        double half = calculatePerimeter() / 2;
        return Math.sqrt(half * (half - sideOne) * (half - sideTwo) * (half - sideThree));
    }

    public void printCircle() {
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println("Area: " + calculateArea());
        System.out.println("Fill color: " + fillColor);
        System.out.println("Border color: " + borderColor);
    }
}
