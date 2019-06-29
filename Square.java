
public class Square extends TwoDimensionalShape { 
	
private double side = 0;
	
public Square (double x) {
	super (x, x);
	setSide(x);
}


public void setSide(double s) {
	side = s;
}
	
public double getSide() {
		return side;
}
	
@Override
public double getArea()  {
		return Math.pow(getSide(), 2); 
}
	
@Override
public String toString() {
		return String.format("%s" ,super.toString());
}

@Override
public String getName() {

		return "Square"; 
}

@Override
public String color() {
	// TODO Auto-generated method stub
	return null;
}

}
