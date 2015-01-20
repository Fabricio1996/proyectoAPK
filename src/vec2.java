
public class vec2 {
	public static char[] productoPunto;
	// miembros de la clase
	public float x,y;
	//constructor
	vec2()
	{
		x = 0.0f;
		y = 0.0f;
	}
	
	// Metodos no estaticos
	public static float magnitud(vec2 V)
	{
		return (float) Math.sqrt((V.x*V.x + V.y*V.y));
	}
	
	// metodos estaticos.
	public static vec2 suma(vec2 a, vec2 b)
	{
		// suma de vector en r2
		vec2 c = new vec2();
		c.x = a.x + b.x;
		c.y = a.y + b.y;
		return c;
	}
	public static float productoPunto(vec2 a, vec2 b)
	{
		
		float retval;
		retval= a.x * b.x + a.y * b.y;
		return retval;
	}
	public static vec2 productoEscalar(vec2 a, float escalar)
	{
		
		vec2 c = new vec2();
		c.x= escalar * a.x;
		c.y= escalar * a.y;
		return a;
		
	}
}
