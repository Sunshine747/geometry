public class PointBuilder implements Builder {
	
	@Override
	public Point buildRandom() {
		Point point = new Point();
		
		point.setX(randomValue());
		point.setY(randomValue());
		
		return point;
	}
	
}