@SuppressWarnings("unchecked")
public class LineSegmentBuilder extends Builder {
	
	@Override
	public LineSegment buildRandom() {
		LineSegment lineSegment = new LineSegment();
		PointBuilder pointBuilder = new PointBuilder();
		
		Point A = pointBuilder.buildRandom();
		Point B = pointBuilder.buildRandom();
		
		lineSegment.setA(A);
		lineSegment.setB(B);
		lineSegment.setName(lineSegment.getClass().getSimpleName());
		
		return lineSegment;
	}
	
	@Override
	public LineSegment buildRandom(String name) {
		LineSegment lineSegment = new LineSegment();
		PointBuilder pointBuilder = new PointBuilder();
		
		Point A = pointBuilder.buildRandom();
		Point B = pointBuilder.buildRandom();
		
		lineSegment.setA(A);
		lineSegment.setB(B);
		lineSegment.setName(name);
		
		return lineSegment;
	}
}