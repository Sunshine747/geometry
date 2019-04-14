import java.util.*;

class Geometry {
	
	public static void main(String args[]) {
		
		ArrayList<Figure> figureList = new FigureGenerator().generate(15);
		
		for(Figure f : figureList) {
			System.out.println(f.toString());
			System.out.println();
		}
		
	}
}