/**
 * 
 */

/**
 * @author Eric Lam
 *
 */
public class Calculate {
	
	
	public static int square(int number){
		return(number * number);
	}
	
	public static int cube(int number){
		return(number * number * number);
	}
	
	public static double average(double numOne,double numTwo){
		double x = numOne + numTwo;
		return(x/2);
	}
	
	public static double average(double numOne,double numTwo,double numThree){
		double x = numOne + numTwo + numThree;
		return(x/3);
	}
	
	public static double toDegrees(double num){
		double x = 180/3.14159;
		return(num * x);
	}
	
	public static double toRadians(double num){
		double x = 3.14159/180;
		return(num * x);
	}
	
	public static double discriminant(double a,double b, double c){
		double x = b * b;
		double y = a * c;
		double z = 4 * y;
		return(x - z);
	}
	
	public static int toImproperFrac(int a, int b, int c){
		int x = c * a;
		int y = x + b;
		return(y  c);
	}
}

