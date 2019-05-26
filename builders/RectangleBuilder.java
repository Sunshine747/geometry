package builders;

import figures.*;

import java.util.*;

@SuppressWarnings("unchecked")
public class RectangleBuilder extends Builder {
	
	@Override
	public Rectangle buildRandom() {
		Rectangle rectangle = new Rectangle();
		PointBuilder pointBuilder = new PointBuilder();
		ArrayList<Point> vertexes = new ArrayList<Point>();
		
		vertexes.add(pointBuilder.buildRandom());
		vertexes.add(pointBuilder.buildRandom());
		vertexes.add(pointBuilder.buildRandom());
		vertexes.add(pointBuilder.buildRandom());
		
		
		rectangle.setVertexes(vertexes);
		rectangle.setName(rectangle.getClass().getSimpleName());
		
		return rectangle;
	}
}