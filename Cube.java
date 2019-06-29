
public class Cube extends ThreeDimensionalShape {

private double side = 0;

public Cube (double y) {
	super (y,y,y);
	setSide(y);
}
	
	
public void setSide(double y) {
		side = y;
}
	
public double getSide() {
		return side;
}

@Override	
public double getArea() {
	
		double cubeArea = 6 * Math.pow(getSide(), 2); 
		return cubeArea;
		
}

@Override
public double getVolume() {
	
	double cubevolume = Math.pow(getSide(), 3); 
	return  cubevolume;
		
	}
	
@Override
public String toString() {
	return String.format("%s" ,super.toString());
}

@Override
public String getName() {
		
	return "Cube";
}

}
