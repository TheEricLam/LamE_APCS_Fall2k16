
public class Split 
{

	public static void main(String[] args){
	
		
	
		//String.split();
		//It's a method that acts on a string, <StringName>.split(<String sp>);
		//Where sp is the string where the string splits
		//And it returns an array
		// Example: "I like apples!".split(" "); 
		//		it will split at spaces and return an array of ["I","like","apples!"]
		// Example 2: "I really like really red apples"split("really")
		//		it will split at the word "really" and return an array of ["I "," like "," apples!"]
		
		//play around with String.split! what happens if you "I reallyreally like apples".split("really") ?
		
		
		//Your task:
		/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
		 * use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
		 * What if it's a fancy sandwich with multiple pieces of bread?
		*/
	}
		public static void splitting(){
			String s = "applespineapplesbreadlettustomatobaconmayohambreadcheese";
			String [] pieces = s.split("bread");
			
			System.out.println("bread"+pieces[1]+"bread");
			if(s.length() == 2){
				System.out.println("bread"+pieces[1]+"bread");
			}
		}
	
	
		/*System.out.println(split("applespineapplesbreadlettustomatobaconmayohambreadcheese"));
		//Your task pt 2:
		/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
		 * use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
		 * Again, what if it's a fancy sandwich with multiple pieces of bread?
		*/

		
	public static void split(){
		String s = "apples pineapples bread lettus tomato bacon mayo ham bread cheese";
		String [] parts = s.split(" ");
		
		for(int i = 0; i < s.length(); i++){
			if(parts[i] == "bread"){
				
			
			}
		}
		
		
	
		
		
		
	}

}
