import java.util.Arrays;

public class ShapeTest {

	public static void main(String[] args) {


		// create subclass objects 
		
		Shape shapes[] = new Shape [6]; 
		shapes[0] = new Circle(4); // radius 
		shapes[1] = new Square (3); // side 
		shapes[2]= new Triangle (3,4); // base and height
		
		shapes [3]= new Sphere (3); // radius 
		shapes [4]= new Cube(10); // side
		shapes [5]= new Tetrahedron (10); // edge length 

		 
		for (Shape i : shapes) {
			
			if (i instanceof TwoDimensionalShape) 
				System.out.printf("%sArea: %.2f\n\n", i.toString(),((TwoDimensionalShape) i).getArea() );
			
			if (i instanceof ThreeDimensionalShape)
				System.out.printf("%sSurface Area: %.2f\nVolume: %.2f\n\n", i.toString(),
						((ThreeDimensionalShape) i).getArea(),
						((ThreeDimensionalShape) i).getVolume());
				
			}

		}

				
	
		
	}


