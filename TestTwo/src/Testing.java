import java.util.*;

public class Testing {
	public static void main (String[] args){
		Scanner word = new Scanner(System.in);
		System.out.print("What is your phrase? ");
		String phrase = word.nextLine();
		System.out.print("How many times should I repeat it? ");
		int times = word.nextInt();
		for (int i = 1; i <= times; i++) {
		    System.out.println(phrase);
		}
		word.close();
	}
	public void processName(Scanner console) {
	    System.out.print("Please enter your full name: ");
	    String name = console.nextLine();
	    String[] parts = name.split("\\s+");
	    System.out.println("Your name in reverse order is " + parts[1] + ", " +
	        parts[0]);
	    
	    console.close();
	}

	
	
}
