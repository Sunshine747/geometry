package builders;

import figures.*;

import java.util.*;

@SuppressWarnings("unchecked")
public class TriangleBuilder extends Builder {
	
	@Override
	public Triangle buildRandom() {
		Triangle triangle = new Triangle();
		PointBuilder pointBuilder = new PointBuilder();
		ArrayList<Point> vertexes = new ArrayList<Point>();
		
		vertexes.add(pointBuilder.buildRandom());
		vertexes.add(pointBuilder.buildRandom());
		vertexes.add(pointBuilder.buildRandom());
		
		triangle.setVertexes(vertexes);
		triangle.setName(triangle.getClass().getSimpleName());
		
		return triangle;
	}
	
	@Override
	public Triangle buildRandom(String name) {
		Triangle triangle = buildRandom();
		triangle.setName(name);
		
		return triangle;
	}
	
}