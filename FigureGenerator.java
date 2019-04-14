import java.util.*;
import static java.lang.Math.*;

class FigureGenerator {
	
	public ArrayList<Figure> generate(int count) {
		
		ArrayList<Figure> figureList = new ArrayList<Figure>();
		int min = 1;
		int max = 6;
		Random r = new Random();
		PointBuilder pointBuilder = new PointBuilder();
		LineSegmentBuilder lineSegmentBuilder = new LineSegmentBuilder();
		TriangleBuilder triangleBuilder = new TriangleBuilder();
		RectangleBuilder rectangleBuilder = new RectangleBuilder();
		CircleBuilder circleBuilder = new CircleBuilder();
		EllipseBuilder ellipseBuilder = new EllipseBuilder();
		
		int i = 0;
		while (i < count) {
			switch (r.nextInt((max - min + 1)) + min) {
				case 1: figureList.add(pointBuilder.buildRandom());
					break;
				case 2: figureList.add(lineSegmentBuilder.buildRandom());
					break;
				case 3: figureList.add(triangleBuilder.buildRandom());
					break;
				case 4: figureList.add(rectangleBuilder.buildRandom());
					break;
				case 5: figureList.add(circleBuilder.buildRandom());
					break;
				case 6: figureList.add(ellipseBuilder.buildRandom());
					break;
			}
			i++;
		}
		
		return figureList;
	}
	
}