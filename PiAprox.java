/*
 * Approximate Pi using the Math.random function in Java.
 * 
 * This code can't stand alone and needs knowledge of the Monte Carlo method of calculating pi.
 * 
 * 
 * To get an approximation of Pi we can call the random function twice and plot the two resulting values in a graph (x,y)
 * After getting the point we calculate the distance to the point from the center (0,0) in the graph.
 * 
 * Using the unit circle to divide the graph into two groups of numbers, numbers below or equal to one belongs inside the unit circle
 * numbers larger than one are outside the circle.
 * 
 * The result should end up giving us pi/4, as we are only using positive numbers and therefore only cover a quarter of the unit circle. 
 */


public class piAprox {

	public static void main(String[] args) {
		
		double point_circle = 0;
		double point_square = 1000;			//This double defines how many times the loop is run.
		
		double distance;					//The distance from any two points in a graph to the center.
		
		
		for(int i=0; i<=point_square; i++) {
			double x = Math.random();		//Getting two random values between zero and one
			double y = Math.random();
			
			distance = Math.pow(x,2) + Math.pow(y,2);	

			/*
			 * I don't use the square root to complete Pythagoras here, because the square root of a number smaller than one is
			 * smaller than one, and the square root of a number larger than one is larger than one.
			*/
			
			if(distance <= 1) {
				point_circle ++;			//Here we add one to the total numbers in the circle if the number is less that one
			}
		}
		
		/* 
		 * Once the loop is finished, we divide the numbers in the circle with the numbers outside the circle.
		 * As we are only using positive numbers, the result is only a fourth of what we expect.
		 */
		
		System.out.println(point_circle + " -/- " + point_square);
		
		System.out.println(4*(point_circle/point_square));
	}

}