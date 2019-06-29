
public abstract class ThreeDimensionalShape extends Shape {
	
	protected final double x; 
	protected final double y; 
	protected final double z; 
		
	public ThreeDimensionalShape (double x, double y, double z) {
		this.x = x; 
		this.y = y; 
		this.z = z; 
	}

	
	public abstract double getVolume();
	
	public abstract double getArea();
	

	public String getColor(String color) {return color;} 	
	@Override
	public String color() {return getColor(null);} 	
	
	


}
