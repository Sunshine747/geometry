package figures;

import java.util.*;
import java.util.stream.*;

public class Polygon extends Figure {
	
	public ArrayList<Point> vertexes = new ArrayList<Point>();
		
	public void setVertexes(ArrayList<Point> vertexes) {
		this.vertexes = vertexes;
	}
	
	public ArrayList<Point> getVertexes() {
		return vertexes;
	}
	
	@Override
	public String toString() {
		return getName() + " "
				+ getVertexes()
				.stream()
				.map(Point::toString)
				.collect(Collectors.joining(", "));
	}
	
}