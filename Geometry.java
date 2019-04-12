import java.util.*;

class Geometry {
	
	public static void main(String args[]) {
		
		ArrayList<Point> vr = new ArrayList<Point>();
		
		Figure f = new Figure();
		f.setName("123");
		f.showName();
		System.out.println(f.getName());
		System.out.println();
		System.out.println();
		
		Point p1 = new Point();
		p1.setName("A");
		p1.setX(0);
		p1.setY(0);
		p1.showName();
		System.out.println(p1.getX());
		System.out.println(p1.getY());
		
		Point p2 = new Point();
		p2.setName("B");
		p2.setX(0);
		p2.setY(5);		
		
		Point p3 = new Point();
		p2.setName("C");
		p2.setX(5);
		p2.setY(5);		
		
		Point p4 = new Point();
		p2.setName("D");
		p2.setX(5);
		p2.setY(0);
		
		LineSegment ls = new LineSegment();
		ls.setA(p1);
		ls.setB(p2);
		ls.setName("line");
		ls.showName();
		System.out.println(ls.length());
		System.out.println(ls.midPoint().getX());
		System.out.println(ls.midPoint().getY());
		
		System.out.println();
		System.out.println();
		
	}
}