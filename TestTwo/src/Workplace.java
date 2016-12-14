public class Workplace{
	public static void main(String[] args){
		int numOne = 4;
		int numTwo = 16;
		
		System.out.println(gcf(numOne,numTwo));
	}
	public static int gcf(int num1, int num2){
		int greatestCommonFactor = 1;
		for(int i=1; i<=num1; i++){
			if(isDivisibleBy(num1,i) && isDivisibleBy(num2,i)){
				greatestCommonFactor=i;
			}
		}
		return (greatestCommonFactor);
	}
	public static boolean isDivisibleBy(int num1, int num2){
		if(num2==0){
			throw new IllegalArgumentException("Cannot divide by zero");
		}
		if(num1%num2 == 0){
			return(true);
		}else{
			return(false);
		}
	}
}