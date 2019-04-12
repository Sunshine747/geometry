import java.util.*;
import static java.lang.Math.*;

class LineSegment extends Figure {
	
	public Point A;
	public Point B;
	
	public Point midPoint() {
		Point returnPoint = new Point();
		
		returnPoint.setX((A.getX() + B.getX())/2);
		returnPoint.setY((A.getY() + B.getY())/2);
		
		return returnPoint;
	}
	
	public int length() {
		return (int) sqrt(pow(A.getX() - B.getX(), 2) + pow(A.getY() - B.getY(), 2));
	}
	
	public void setA(Point A) {
		this.A = A;
	}	
	
	public void setB(Point B) {
		this.B = B;
	}
	
	public Point getA() {
		return A;
	}
	
	public Point getB() {
		return B;
	}
}