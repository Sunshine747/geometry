package figures;
	
public class Ellipse extends Oval {
	@Override
	public String toString() {
		return getName() + " " + center.toString() + " Major Axis = " + getMajorAxis() + " Minor Axis = " + getMinorAxis();
	}
	
}