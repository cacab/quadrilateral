
public abstract class TwoDimensionalShape extends Shape {


protected final double x; 
protected final double y; 
	
public TwoDimensionalShape(double x, double y) {

	this.x = x; 
	this.y = y; 

}

	public abstract double getArea();

	

}
