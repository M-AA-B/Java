
public class MathCalc{
	public static void main(String[] args){
	    double s_diam = 865_000.0; // Sun Diameter.
        double e_diam = 7600.0; // Earth Diameter
        double s_V = (4*Math.PI/3)*Math.pow(s_diam/2, 3); // Sun Volume. 
        double e_V =(4*Math.PI/3)*Math.pow(e_diam/2, 3); // Earth Volume.
        double ratio = s_V/e_V; // Sun Volume /Earth Volume.
        System.out.println("a. The volume of the Sun is " + s_V + " cubic miles.");
        System.out.println("b. The volume of the Earth is " + e_V + " cubic miles.");
        System.out.println("c. The ratio of the volume of the Sun to the volume of the Earth is " + ratio );
		
	}
}