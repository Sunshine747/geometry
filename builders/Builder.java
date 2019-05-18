package builders;

import figures.*;

import static java.lang.Math.*;

import java.util.Random;

public abstract class Builder {
	
	double max = 10;
	double min = -10;
	
	public double randomValue() {
		Random r = new Random();
		return (double) round((min + r.nextDouble() * (max - min)) * 100)/100;
	}
	
	abstract <T> T buildRandom();
	
	public <T extends Figure> T buildRandom(String name) {		
		T t;
		t = buildRandom();
		t.setName(name);
		return t;
	}
	
}
