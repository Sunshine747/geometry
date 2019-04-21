class Circle extends Oval {
	
	@Override
	public String toString() {
		return getName() + " " + center.toString() + " r = " + getMajorAxis();
	}
	
}