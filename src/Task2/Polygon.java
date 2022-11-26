package Task2;

import java.util.ArrayList;
import java.util.List;

public class Polygon extends GeomFigure implements WithAngles{
    private int numberOfPoints;
    protected Point[] points = new Point[numberOfPoints];
    private Point polygonCenter;

    public Polygon(Point[] points) {
        this.points = points;
        numberOfPoints = points.length;

        sortPoints();
    }

    public Polygon() {}
    private void polygonCenterInit() {
        double xSum = 0;
        double ySum = 0;

        for(Point point : points) {
            xSum += point.getX();
            ySum += point.getY();
        }

        polygonCenter = new Point(xSum / numberOfPoints, ySum / numberOfPoints);
    }

    private void sortPoints() {
        polygonCenterInit();

        List<Point> beforeCenter = new ArrayList<>();
        List<Point> afterCenter = new ArrayList<>();

        for(Point point : points) {
            if(point.getX() <= polygonCenter.getX()) {
                beforeCenter.add(point);
            }
            else {
                afterCenter.add(point);
            }
        }

        beforeCenter.sort((p1, p2) -> (int) (p1.getY() - p2.getY()));
        afterCenter.sort((p1, p2) -> (int) (p2.getY() - p1.getY()));

        beforeCenter.addAll(afterCenter);

        points = new Point[beforeCenter.size()];
        points = beforeCenter.toArray(points);
    }

    public Point[] getPoints() {
        return points;
    }

    public void setPoints(Point[] points) {
        this.points = points;
        numberOfPoints = points.length;
    }

    @Override
    public double GetPerimeter() {
        sortPoints();

        double result = 0;

        for(int i = 0; i < points.length - 1; i++) {
            result += Math.sqrt(Math.pow(points[i+1].getX() - points[i].getX(), 2) + Math.pow(points[i+1].getY() - points[i].getY(), 2));
        }

        result += Math.sqrt(Math.pow(points[0].getX() - points[numberOfPoints - 1].getX(), 2) + Math.pow(points[0].getY() - points[numberOfPoints - 1].getY(), 2));

        return result;
    }

    @Override
    public double GetArea() {
        sortPoints();

        double result = 0;

        for(int i = 0; i < numberOfPoints - 1; i++) {
            result += points[i].getX() * points[i+1].getY();
        }

        result += points[numberOfPoints - 1].getX() * points[0].getY();

        for(int i = 0; i < numberOfPoints - 1; i++) {
            result -= points[i].getY() * points[i+1].getX();
        }

        result -= points[0].getX() * points[numberOfPoints - 1].getY();

        return Math.abs(result) / 2;
    }

    @Override
    public void printCoordinates() {
        for(Point point : points) {
            System.out.println(point);
        }
    }
}
