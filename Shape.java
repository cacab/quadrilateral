
public abstract class Shape {

	
	

	public abstract String color(); 	
	
	public abstract String getName(); 	
	
	@Override
	public String toString() {
		return String.format("Shape: %s\n", getClass().getName());
	}
	
}
