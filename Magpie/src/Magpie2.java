
public class Magpie2 {

	//Get a default greeting and return a greeting	
	public String getGreeting() {
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 * takes in a user statement
	 * returns a response based on given rules
	 */
	public String getResponse(String statement) {
		String response = "";
		if (statement.indexOf("no") >= 0) {
			response = "Whats the matter??";
		}else if(statement.indexOf("Hello") >= 0){
			response = "Hello, how are you?";
		}else if(statement.indexOf("Good") >= 0){
			response = "How good?";
		}else if(statement.indexOf("Bad") >= 0){
			response = "How bad?";
		} else if (statement.indexOf("Dryer") >= 0
				|| statement.indexOf("Jackson") >= 0
				|| statement.indexOf("Paul") >= 0
				|| statement.indexOf("Hensley") >= 0) {
			response = "Your teacher sounds really cool, tell me more.";
		} else {
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * returns a non-committal string
	 */
	private String getRandomResponse() {
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0) {
			response = "Interesting, tell me more.";
		} else if (whichResponse == 1) {
			response = "Hmmm.";
		} else if (whichResponse == 2) {
			response = "Do you really think so?";
		} else if (whichResponse == 3) {
			response = "You don't say.";
		}

		return response;
	}
}
