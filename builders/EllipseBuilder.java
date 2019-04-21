import static java.lang.Math.*;

@SuppressWarnings("unchecked")
class EllipseBuilder extends Builder {
	
	double val1 = abs(randomValue());
	double val2 = abs(randomValue());
	
	@Override
	public Ellipse buildRandom() {
		Ellipse ellipse = new Ellipse();
		PointBuilder pointBuilder = new PointBuilder();
		
		if (val1 > val2) {
			ellipse.setCenter(pointBuilder.buildRandom());
			ellipse.setMajorAxis(val1);
			ellipse.setMinorAxis(val2);
			ellipse.setName(ellipse.getClass().getSimpleName());
		} else {
			ellipse.setCenter(pointBuilder.buildRandom());
			ellipse.setMajorAxis(val2);
			ellipse.setMinorAxis(val1);
			ellipse.setName(ellipse.getClass().getSimpleName());
		}
		
		return ellipse;
	}
	
	@Override
	public Ellipse buildRandom(String name) {
		Ellipse ellipse = new Ellipse();
		PointBuilder pointBuilder = new PointBuilder();
		
		if (val1 > val2) {
			ellipse.setCenter(pointBuilder.buildRandom());
			ellipse.setMajorAxis(val1);
			ellipse.setMinorAxis(val2);
			ellipse.setName(name);
		} else {
			ellipse.setCenter(pointBuilder.buildRandom());
			ellipse.setMajorAxis(val2);
			ellipse.setMinorAxis(val1);
			ellipse.setName(name);
		}
		
		return ellipse;
	}
	
}