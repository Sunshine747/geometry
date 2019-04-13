public class LineSegmentBuilder implements Builder {
	
	@Override
	public LineSegment buildRandom() {
		LineSegment lineSegment = new LineSegment();
		PointBuilder pointBuilder = new PointBuilder();
		
		Point A = pointBuilder.buildRandom();
		Point B = pointBuilder.buildRandom();
		
		lineSegment.setA(A);
		lineSegment.setB(B);
		
		return lineSegment;
	}
}