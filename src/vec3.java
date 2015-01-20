
public class vec3 {
	public float x,y,z;
	
	vec3()
	{
		x = 0.0f;
		y = 0.0f;
		z = 0.0f;
	}
	
	public static float magnitud(vec3 V)
	{
		return (float)Math.sqrt( V.x * V.x +V.y*V.y +V.z*V.z );
	}
}
