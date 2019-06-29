
public class Tetrahedron extends ThreeDimensionalShape{
	
private double edgeLength=0;

public Tetrahedron (double z) {
	super (z,z,z);
	setEdgeLength(z);
}
	
	
public void setEdgeLength(double z) {
		edgeLength = z;
}
	
public double getEdgeLength() {
	
		return edgeLength;
}
	

@Override
public double getVolume() {
	
	double tetrahedronVolume =  Math.pow(getEdgeLength(),3)/(6 * Math.sqrt(2)); 
	
	return  tetrahedronVolume;
}

@Override
public double getArea() {
	
	double tetrahedronArea= Math.sqrt(3) * Math.pow(getEdgeLength(), 2);

	return  tetrahedronArea;

}

@Override
public String getName() {

	return  "Tetrahedron";
}
	
@Override
public String toString() {
	
	return String.format("%s" ,super.toString());
	}


		
}
