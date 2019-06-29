
public class Sphere extends ThreeDimensionalShape {
private double radius = 0;

	
public Sphere (double y) {
	super (y,y,y);
		setRadius(y);
}

	
public void setRadius(double y) {
	
		radius = y;
}
	
public double getRadius() {
		return radius;
}
	
@Override
public double getArea() {
		double SphereArea = (Math.pow(radius, 2))*(4 * Math.PI); 
		return SphereArea; 
}
	
@Override
public double getVolume() {
	
		double sphereVolume = (1.3333 * Math.PI ) * (Math.pow(radius,3));
		
	return sphereVolume; 
				
}
	
@Override
public String toString() {
	return String.format("%s" ,super.toString());
	}

@Override
public String getName() {
	// TODO Auto-generated method stub
	return "Sphere";
}
	
}
