import static java.lang.Math.*;

import java.util.Random;

public interface Builder {
	
	double max = 10;
	double min = -10;
	
	default double randomValue() {
		Random r = new Random();
		return (double) round((min + r.nextDouble() * (max - min)) * 100)/100;
	}
	
	Point buildRandom();
	
}
