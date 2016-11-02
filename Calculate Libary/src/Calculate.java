
/*
 * @author Eric Lam
 *	Version 1.7 09/25/16
 */
public class Calculate {
	/*
	 * Various amounts of methods which 
	 * can be called by another project 
	 * with user input
	 */
	
	//To find the square of an integer
	public static int square(int number){
		return(number * number); // the number times itself is the square of the number
	}
	
	//To find the cube of an integer, multiple that number by 3
	public static int cube(int number){
		return(number * number * number); 
	}
	
	//Finding the average by add up all the numbers, then
	// divide by two doubles 
	public static double average(double numOne,double numTwo){
		//double x = numOne + numTwo;
		return(numOne + numTwo/2);
	}
	
	//takes in 3 user inputs, adds up all the numbers and divides the sum by 2
	public static double average(double numOne,double numTwo,double numThree){
		//double x = numOne + numTwo + numThree;
		return(numOne + numTwo + numThree/3);
	}
	
	//takes in a user input double and multiplies it by 180o divided by pi
	public static double toDegrees(double num){
		//double x = 180/3.14159;
		return(num * 180/3.14159);
	}
	
	//takes in a double and multiplies it by pi divided by 180
	public static double toRadians(double num){
		//double x = 3.14159/180;
		return(num * 3.14159/180);
	}
	
	//takes in 3 doubles and identifys the roots; sub part of the quadratic formula
	public static double discriminant(double a,double b, double c){
		double x = b * b; // b squared 
		double y = a * c; 
		double z = 4 * y;
		return(x - z); //b^2 - 4 * a * c
	}
	
	//changes an improper Fraction into 
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
	
	public static double round2(double num){
		num = num * 100;
		num += .5;
		
		return(num / 100);
	}
	
	public static double exponent(int base, double power){
		double answer = 1.0;
				if(power == 0){
					return (1);
				}
				for(int i = 1; i <= power; i++){
					answer *= base;
				}
				return(answer);
	}
	public static int factorial(int x){
		int answer = 1;
		if(x == 0){
			return(1);
		}
		for(int i = 1; i <= x; i++){
			answer *=i;
		}
		return answer;
	}
	public static boolean isPrime(int num){
		boolean test;
		for(int i = num - 1; i > 1; i--){
			test = Calculate.isDivisibleBy(num, i);
			if(test == true){
				return(false);
			}
		}
	}
	
	public static int gcf(int a, int b){
		int gcf = 1;
		for(int i=1; i<= a; i++){
			if(isDivisibleBy(a,i) && isDivisibleBy(b, i)){
				gcf =1;
			}
		}
	}
	public static double sqrt(double num){
		for(double i= 0.1; i <= num ; i += 0.1){
			double mutliply = i * i;
			if(Calculate.absValue(mutliply - num) <= 0.1){
				return Calculate.round2(i);
			}
		}
		return(2.0);
	}

	public static String quadForm(double a, double b, double c){	
	
	double bMinus = -b - (Calculate.sqrt(Calculate.discriminant(a, b, c)));
	double bPlus = -b + (Calculate.sqrt(Calculate.discriminant(a, b, c)));
	double bottomPart = 2 * a;
	
	double totalMinus = bMinus / bottomPart;
	double totalPlus = bPlus / bottomPart; 
	
	if(totalMinus == totalPlus){
		String answerOne = ("\"" + totalMinus + "\"" );
		return(answerOne);
	}else if(totalMinus < 0 && totalPlus < 0){
		String noRoots = ("\"no real roots\"");
		return(noRoots);
	}else if(!(totalMinus==totalPlus)){
		String answerTwo = ("\"" + totalMinus + " and " + totalPlus + "\"");
		return(answerTwo);
	
	return("hi");
	}
     
      
 



}


