import java.util.*;

class Polygon extends Figure {
	
	public ArrayList<Point> vertexes = new ArrayList<Point>();
		
	public void setVertexes(ArrayList<Point> vertexes) {
		this.vertexes = vertexes;
	}
	
	public ArrayList<Point> getVertexes() {
		return vertexes;
	}
}