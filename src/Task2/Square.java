package Task2;

public class Square extends GeomFigure{
    private Point topRight;
    private Point bottomLeft;
    private Color color;

    public Square(Point topRight, Point bottomLeft) {
        if(topRight.getX() - bottomLeft.getX() != topRight.getY() - bottomLeft.getY()) {
            System.out.println("Your figure is not a square.");
        } else {
            this.topRight = topRight;
            this.bottomLeft = bottomLeft;
            color = Color.WHITE;
        }
    }

    public Point getTopRight() {
        return topRight;
    }

    public void setTopRight(Point topRight) {
        this.topRight = topRight;
    }

    public Point getBottomLeft() {
        return bottomLeft;
    }

    public void setBottomLeft(Point bottomLeft) {
        this.bottomLeft = bottomLeft;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public double GetPerimeter() {
        return (topRight.getX() - bottomLeft.getX()) * 4;
    }

    @Override
    public double GetArea() {
        return Math.pow(topRight.getX() - bottomLeft.getX(), 2);
    }
}
