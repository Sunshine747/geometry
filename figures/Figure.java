package figures;

public class Figure {
	
	public String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		if (name == null) {
			return getClass().getSimpleName();
		} else {
			return name;
		}
	}
	
	public void showName() {
		System.out.println(name);
	}
	
}