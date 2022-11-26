package Task2;

public class Rhombus extends Polygon implements WithDiagonals{
    private double vector1X;
    private double vector1Y;
    private double vector2X;
    private double vector2Y;

    public Rhombus(Point[] points) {
        super(points);

        if(points.length > 4) {
            System.out.println("Rhombus is a four-corner figure.");

            this.points = new Point[] {new Point(0, 0)};
        } else {

            vector1X = this.points[2].getX() - this.points[0].getX();
            vector1Y = this.points[2].getY() - this.points[0].getY();
            vector2X = this.points[1].getX() - this.points[3].getX();
            vector2Y = this.points[1].getY() - this.points[3].getY();

            double cosBetweenDiagonals = (vector1X * vector2X + vector1Y * vector2Y)
                    / ( Math.sqrt(vector1X*vector1X + vector1Y*vector1Y)
                    + Math.sqrt(vector2X*vector2X + vector2Y*vector2Y) );

            if(cosBetweenDiagonals != 0) {
                System.out.println("Your figure is not a rhombus");

                this.points = new Point[] {new Point(0, 0)};
            }
        }
    }

    @Override
    public double getTheBiggestDiagonalLength() {
        if(Math.sqrt(vector1X*vector1X + vector1Y*vector1Y) > Math.sqrt(vector2X*vector2X + vector2Y*vector2Y)) {
            return Math.sqrt(vector1X*vector1X + vector1Y*vector1Y);
        } else {
            return Math.sqrt(vector2X*vector2X + vector2Y*vector2Y);
        }
    }

    @Override
    public double getTheSmallestDiagonalLength() {
        if(Math.sqrt(vector1X*vector1X + vector1Y*vector1Y) < Math.sqrt(vector2X*vector2X + vector2Y*vector2Y)) {
            return Math.sqrt(vector1X*vector1X + vector1Y*vector1Y);
        } else {
            return Math.sqrt(vector2X*vector2X + vector2Y*vector2Y);
        }
    }
}
