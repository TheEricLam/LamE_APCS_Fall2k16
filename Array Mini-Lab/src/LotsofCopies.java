
public class LotsofCopies {

	public static void main(String[] args) {
		int num = 7;                          //Prints out 7
		String strMain = "APCS";              //Prints out APCS
		int [] arrMain = {1,2,3,4,5};         //Prints out 1 2 3 4 5
		
		System.out.println(num);
		System.out.println(strMain);
		print(arrMain);
	}
	
	//Printing method to print arrays
	public static void print(int[] list){
		System.out.print("["+ list[0]);
		for(int i = 1; i <list.length; i ++){
			System.out.print(", " + list[i]);
			}
		System.out.println("]");
	}
	
	public static void changeMe(int x, String str, int[] arr){
		
	}
}
