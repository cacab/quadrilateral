
public class Circle extends TwoDimensionalShape {
	
private double radius = 0;
	
public Circle(double y) {
	super (y,y);
		setRadius(y);
}
	
public void setRadius(double y) {
		radius = y;
}
	
public double getRadius() {
	
		return radius;
	}
	
public double getArea() {
	
		double CircleArea = Math.PI * (Math.pow(radius, 2));
		
		return CircleArea;
		
	}
	
@Override
public String toString() {
	return String.format("%s" ,super.toString());

	}

@Override
public String getName() {
	
	return "Circle";
}

@Override
public String color() {
	// TODO Auto-generated method stub
	return null;
}

	
}

