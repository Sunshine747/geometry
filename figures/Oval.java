package figures;

public class Oval extends Figure {
	
	Point center;
	double majorAxis;
	double minorAxis;
	
	public void setCenter(Point center) {
		this.center = center;
	}
	
	public void setMajorAxis(double majorAxis) {
		this.majorAxis = majorAxis;
	}
	
	public void setMinorAxis(double minorAxis) {
		this.minorAxis = minorAxis;
	}
	
	public Point getCenter() {
		return center;
	}
	
	public double getMajorAxis() {
		return majorAxis;
	}
	
	public double getMinorAxis() {
		return minorAxis;
	}
	
}