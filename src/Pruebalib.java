
public class Pruebalib {
	public static void main(String[] args)
	{
		System.out.println("lib AL");
		
		vec2 miVector;
		miVector = new vec2();
		miVector.x = 2.0f;
		miVector.y = 1.0f;
		System.out.println(vec2.magnitud(miVector));
		
	    vec2.suma(miVector, miVector);
	     
	    System.out.println(vec2.magnitud(miVector));
	    
	    miVector = vec2.suma(miVector, miVector);
	     
	    System.out.println(vec2.magnitud(miVector));
	    
	    System.out.println(vec2.productoPunto(miVector, miVector));
	    
	    System.out.print(miVector.x);
	    System.out.print(miVector.y);
	}
}
