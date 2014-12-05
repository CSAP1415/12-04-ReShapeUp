// A Line object represents a line defined by a pair of Points.
public class Line
{
 private Point pointStart;
 private Point pointEnd;
 public Line()
 {
 pointStart = new Point();
 pointEnd = new Point();
 }
 public Line(Point a, Point b)
 {
 pointStart = a;
 pointEnd = b;
 }
 public double length()
 {
 return pointStart.distance(pointEnd);
 }
 public double slope()
 {
 return (pointEnd.getY() - pointStart.getY())/ (pointEnd.getX() - pointStart.getX());
 }
 public String toString()
 {
 return "(" + pointStart.getX() + "," + pointStart.getY() + ")" + " " + "(" + pointEnd.getX() + "," + pointEnd.getY() + ")";
 }
 public void translate(int c, int d)
 {
 pointStart.translate( c, d);
 pointEnd.translate( c, d);
 }
}
