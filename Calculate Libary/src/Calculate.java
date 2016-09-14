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
	
	public static String toImproperFrac(int a, int b, int c){
		int x = c * a;
		int y = x + b;
		String str = y + "/" + c;
		return str;
	}
	
	public static String toMixedNum(int a, int b){
		int x = a / b;
		int y = a % b;
		String str = x + "_" + y + "/" + b;
		return str;	
	}
	
	public static String foil(int a, int b, int c, int d, String e){
		int x = a * c; // n^2
		int y = a * d; // n
		int z = b * c; // n
		int j = b * d;
		int i = y + z; // adding commons
		String str = "(" + x + e + "^2)" + " + " + "("+ i + e + ")" + " + " + "(" + j + ")";
		return str;		
	}
	
	public static boolean isDivisibleBy(int a, int b){
		if(a % b == 0){
			return true;
		}else{
			return false;
		}
	}
	
	public static double absValue(double a){
		double x  = a - 0;
		if(x > 0){
			return x;
		}else{
			return 0 - a;
		}
	}
	
	public static int max(int a, int b){
		if(a > b){
			return a;
		}else{
			return b;
		}
	}
	
	public static double max(double a, double b, double c){
		if(a > b && a > c){
			return a;
		}
		if(b > a && b > c){
			return b;
		}
		if(c > a && c > b){
			return c;
		}
		return(2.3);
	}
	
	public static int min(int a, int b){
		if( a < b){
			return a;
		}
		if(b < a){
			return b;
		}
		return(2);
		
	}
	
	public static double round2(double a){
		double x = 
	}
} 

