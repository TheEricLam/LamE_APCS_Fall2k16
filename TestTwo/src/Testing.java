
public class Testing {

	public static void Splitter(String[] args) {
		String s = "apples pineapples bread lettus tomato bacon mayo ham bread cheese";
		String [] parts = s.split(" ");
		
		int bread =0;
		for(int i = 0; i < s.length(); i++){
			if(parts[i] == "bread"){
				bread = i;
			}
		}
		
		
	
		//if(!(parts[0]== "bread")){
		//	System.out.println("This is not a sandwitch");
		//}
		
	}

}
