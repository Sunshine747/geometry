package builders;

import figures.*;

import static java.lang.Math.*;

@SuppressWarnings("unchecked")
public class CircleBuilder extends Builder {
	
	@Override
	public Circle buildRandom() {
		Circle circle = new Circle();
		PointBuilder pointBuilder = new PointBuilder();
		
		circle.setCenter(pointBuilder.buildRandom());
		circle.setMajorAxis(abs(randomValue()));
		circle.setName(circle.getClass().getSimpleName());
		
		return circle;
	}

}