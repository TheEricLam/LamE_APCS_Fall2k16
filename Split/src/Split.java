
public class Split 
{

	public static void main(String[] args) 
	{
		String s = "applespineapplesbreadlettustomatobaconmayohambreadcheese";
		String [] parts = s.split("bread");
		
	
		if(!(parts[0]== "bread")){
			System.out.println("This is not a sandwitch");
		}
	
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
		
	/*	public static String Split(){
			String string = "Hello-there";
			String [] parts = string.split("-");
			String part1 = parts[0];
			String part2 = parts[1];
			System.out.println(part1);
			System.out.println(part2);

		}
		public static String Sandwitch(){
			String string = "applespineapplesbreadlettustomatobaconmayohambreadcheese";
			String [] parts = string.split("bread");
			String part1 = parts[0];
			String part2 = parts[1];
			String part3 = parts[2];
			System.out.println(part1 + " "+ part2 + " "+ part3);
		}
	
		System.out.println(split("applespineapplesbreadlettustomatobaconmayohambreadcheese"));
		//Your task pt 2:
		/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
		 * use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
		 * Again, what if it's a fancy sandwich with multiple pieces of bread?
		*/

		

	}

}