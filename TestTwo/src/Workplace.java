

public class ArraysLab3 {


	public static void main(String[] args) {
		int[] test1 = {1 ,2 ,3 ,4};
		int[] test2 = {1, 2, 3, 4};
		
		sum(test1, test2);
		append(test1, 2);
		remove(test1, 1);
		
		


	}
	
	//Simple a + b = c algorithem but using a for loop to add up the "i"s
	public static int [] sum(int[] arr1, int[] arr2){
		int[] total = new int[arr1.length];   //since both arr1 and arr2 are equal length, i initalized it for one
		for(int i = 0; i < arr1.length; i++){ 
			total[i] = arr1[i] + arr2 [i];    // total = arr1 + arr2
		}
		return(total);
	}
	
	public static int[] append(int[] arr, int num){
		//int [] total = new int[arr.length];
		//for(int i = 0; i < arr.length; i++)
		arr[arr.length + 1] = num;
		return arr;
	}


	//public static int[] remove(int[] arr, int idx){
		
	//}
	
	public static int sumEven(int[] arr){
		int total = 0;
		for(int i = 0; i < arr.length; i++){
			if(i%2 == 0){
				total += i;
			}
		}
		return(total);
	}
	
	
}




