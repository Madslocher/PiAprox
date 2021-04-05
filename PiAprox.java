/**
 * 
 * @author Mads
 *
 * From the random function, approximate Pi (3,14159)
 * 
 * Solution based on unit circle and the MonteCarlo method of plotting random numbers
 * 
 *
 */


public class main {

	public static void main(String[] args) {
		
		double point_circle = 0;
		double point_square = 100000;
		
		double distance;
		
		
		for(int i=0; i<=point_square; i++) {
			double x = Math.random();
			double y = Math.random();
			
			distance = Math.pow(x,2) + Math.pow(y,2);
			
			if(distance <= 1) {
				point_circle ++;
			}
		}
		
		System.out.println(point_circle + " -/- " + point_square);
		
		System.out.println(4*(point_circle/point_square));

	}
}