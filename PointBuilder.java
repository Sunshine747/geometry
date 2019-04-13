@SuppressWarnings("unchecked")
public class PointBuilder extends Builder {
	
	@Override
	public Point buildRandom() {
		Point point = new Point();
		
		point.setX(randomValue());
		point.setY(randomValue());
		point.setName(point.getClass().getSimpleName());
		
		return point;
	}
	
	@Override
	public Point buildRandom(String name) {
		Point point = new Point();
		
		point.setX(randomValue());
		point.setY(randomValue());
		point.setName(name);
		
		return point;
	}
}