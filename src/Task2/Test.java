package Task2;

public class Test {
    public static void main(String[] args) {
        Polygon polygon = new Polygon(new Point[] {new Point(-1, -1), new Point(-1,1), new Point(1, -1), new Point(1, 1)});

        System.out.println("Area is " + polygon.GetArea());
        System.out.println("Perimeter is " + polygon.GetPerimeter());

        Circle circle = new Circle(new Point(1, 2), 3.55);

        System.out.println("Area is " + circle.GetArea());
        System.out.println("Color is " + circle.getColor());

        circle.setColor(Color.PURPLE);

        System.out.println("Color is " + circle.getColor());

        Square square = new Square(new Point(2, 2), new Point(0, 0));

        System.out.println("Perimeter is " + square.GetPerimeter());

        Rhombus rhombus = new Rhombus(new Point[] {new Point(-2, 0), new Point(2, 0),
                new Point(0, 1), new Point(0, -1)});

        System.out.println("Area is " + rhombus.GetArea());
        System.out.println("Perimeter is " + rhombus.GetPerimeter());
        System.out.println("The biggest diagonal is " + rhombus.getTheBiggestDiagonalLength());
        rhombus.printCoordinates();
    }
}
