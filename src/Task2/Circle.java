package Task2;

public class Circle extends GeomFigure{
    private Point center;
    private double radius;
    private Color color;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
        color = Color.WHITE;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public double GetPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double GetArea() {
        return Math.PI * radius * radius;
    }
}
