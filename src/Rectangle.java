// A Rectangle object represents a rectangle defined by an origin point (bottom left corner), plus width and height.
public class Rectangle
{
private Point topRight;
private Point origin;
private int width;
private  int height;

 public Rectangle()
 {
 origin = new Point();
 height = 0;
 width = 0;
 }
 public Rectangle (Point a, int width, int height)
 {
 origin=a;
 this.width=width;
 this.height=height;
 topRight.setX(origin.getX()+width);
 topRight.setY(origin.getY()+height);
 }
 public void translate(int n, int m)
 {
 origin.translate(n,m);
 topRight.translate(n,m);
 }
 public void scale(int c, int d)
 {
 width=width+c;
 height=height+d;
 topRight.setX(topRight.getX()+c);
 topRight.setY(topRight.getY()+d);
 }
 public int getHeight()
 {
 return height;
 }
 public int getWidth()
 {
 return width;
 }
 public boolean isSquare()
 {
 if (width==height)
 {
 return true;
 }
 else
 {
 return false;
 }
 }
 public double area()
 {
 return (double) width*height;
 }
 public double perimeter()
 {
 return (double) (width*2)+(height*2);
 }
 public double diagonal()
 {
 return origin.distance(topRight);
 }
 public Point getBottomLeft()
 {
 return origin;
 }
 public Point getTopRight()
 {
 return topRight;
 }
 public String toString()
 {
 return (origin.toString()+", "+topRight.toString());
 }
}
