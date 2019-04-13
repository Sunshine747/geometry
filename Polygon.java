import java.util.*;

class Polygon extends Figure {
	
	public ArrayList<Point> vertexes = new ArrayList<Point>();
		
	public void setVertexes(ArrayList<Point> vertexes) {
		this.vertexes = vertexes;
	}
	
	public ArrayList<Point> getVertexes() {
		return vertexes;
	}
	
	@Override
	public String toString() {
		String s = getName();
		for(Point point : getVertexes()) {
			s = s + " " + point.toString() + ",";
		}
		
		return s.substring(0, s.length() - 1);
	}
}