class Point extends Figure {
	
	public double X;
	public double Y;
	
	public void setX(double X) {
		this.X = X;
	}
	
	public void setY(double Y) {
		this.Y = Y;
	}
	
	public double getX() {
		return X;
	}
	
	public double getY() {
		return Y;
	}
	
	@Override
	public String toString() {
		return getName() + "(" + getX() + ";" + getY() + ")";
	}
	
}