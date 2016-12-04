public class Testing{

	public static void main(String[] args){
		int[] num = {5, 1, 2};
		int[] answer = toImproperFrac(num);
		System.out.println(answer[0] + "/" + answer[1]);
		
	}
	
	public static int[] toImproperFrac(int[] arrayNum){
		int[] newFraction = {0,0};
		int numerator = (arrayNum[2] * arrayNum[0]) + arrayNum[1];
		newFraction[0] = numerator;
		newFraction[1] = arrayNum[2];
		return newFraction;      
	}
		   
		
	
}