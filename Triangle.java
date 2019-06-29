
public class Triangle extends TwoDimensionalShape {

public double base;
public double height;

public Triangle (double x, double y) {
	super (x,y);
	setBase(x);
	setHeight(y);
}

	
public void setBase(double x) {
	
		base = x;
}
	
public void setHeight(double y) {
	
		height = y;
}
	
public double getBase() {
	
		return base;
}
	
public double getHeight() {
	
		return height;
}

@Override
public double getArea()  {
	
		double triangleArea = .5 * base * height;
		
		return triangleArea;
}
	
@Override
public String toString() {
	
	return String.format("%s" ,super.toString());
		
	}

@Override
public String getName() {
	
	return "Triangle";
	}


@Override
public String color() {
	// TODO Auto-generated method stub
	return null;
}
}
