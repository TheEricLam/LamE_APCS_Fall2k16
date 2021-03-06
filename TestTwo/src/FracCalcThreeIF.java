package fracCalc;


import java.util.Scanner;


public class FracCalcThreeIF{
	


    public static void main(String[] args) 
    {
        // TODO: Read the input from the user and call produceAnswer with an equation
   
    	System.out.println("Enter your operands, only two operands and a operator to compile.");
    	Scanner userInput = new Scanner(System.in);
    	String inputNum = userInput.nextLine();
    	while(inputNum != "quit"){
    		int[] answers = produceAnswer(inputNum);
    		System.out.print("whole:" + answers[0]);
    		System.out.print(" numerator:" + answers[1]);
    		System.out.print(" denominator:" + answers[2]);
    		System.out.println("");
    		System.out.println(answers[3] + "_" + answers[4] + "/" + answers[5]);
    		
    		
    		
    		System.out.println(" ");
    		inputNum = userInput.nextLine();
    	}
    		
    	


    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    
    public static int[] produceAnswer(String input){
    	int[] answers = {0,0,0,0,0,0};
    	
    	String[] inputParse = parseInput(input); // Splits the expression from space; gets 1st Operand, 2nd Operand, & operator
    	
    	//Takes the output of parseInput, and splits to find the whole, numerator, and denominator
    	
    	int[] firstOperand = parseOperand(inputParse[0]);// The first operand of the expression
    	int[] secondOperand = parseOperand(inputParse[2]);// The second operand of the expression
    	String operator = inputParse[1]; //The operator of the expression
    	
    	for(int i = 0; i < 3; i++){
    		answers[i] = secondOperand[i];
    	}
    	
    	int[]firstImproperFrac = {0,0,0};
    	int[]secondImproperFrac = {0,0,0};
    	int[] operatorCalc = {0,0,0};
    	
    	
    	if(!(input.indexOf("_" ) > 0)){ 
    		firstImproperFrac = toImproperFrac(firstOperand);
        	secondImproperFrac = toImproperFrac(secondOperand);
        	if(operator.equals("+")||operator.equals("-")){
        		operatorCalc  = addSubtractFrac(firstImproperFrac, secondImproperFrac, operator);
     
        	}else{
        		operatorCalc = multiplyDivideFrac(firstImproperFrac, secondImproperFrac, operator);
        	}
        	
    	}else if(!((input.indexOf("/") > 0))){
    		
    	}else{
    		
    	}
    		
    	
    	
    	
    	
    	
    	
    	
    	answers[3] = operatorCalc[0];
    	answers[4] = operatorCalc[1];
    	answers[5] = operatorCalc[2];
    	
    	
    	return answers;
    	
    	
    }
    public static String[] parseInput(String inputExpression){
       String[] inputArray = inputExpression.split("\\s+"); //must split from the space since it will not always be a "+" operator
       return inputArray;							        
       
    }
    
   public static int[] parseOperand(String num){
	  int[] individualNum = {0, 0, 0};// collects the integers for whole,numerator, and denominator
	  					  // index 0 = whole; index 1 = numerator; index 2 = denominator
	  
	//checks if the expression has a "_"
	  if(num.indexOf("_" ) > 0){  
		  
	      String[] wholeNumSplit = num.split("_"); //splits to get get the whole number
	      individualNum[0] = Integer.parseInt(wholeNumSplit[0]); //changes the string into the return type, integer
	        
	      String[] numeratorSplit = wholeNumSplit[1].split("/"); // splits to get the numerator and denominator
	      individualNum[1] = Integer.parseInt(numeratorSplit[0]);// the numerator
	      individualNum[2] = Integer.parseInt(numeratorSplit[1]);// the denominator 
	       
	      return individualNum;
	 
	  //checks if the expression has a "/"
      }else if(num.indexOf("/") > 0){ 
    	  String[] numeratorSplit = num.split("/"); // splits to get the numerator and denominator
    	  individualNum[1] = Integer.parseInt(numeratorSplit[0]);// the numerator
	      individualNum[2] = Integer.parseInt(numeratorSplit[1]);// the denominator 
	      
	      return individualNum;
	      
	  //If the expression does not have a "_" or "/" then it is a whole number   
      }else{ 
    	  individualNum[0] = Integer.parseInt(num); 
    	  return individualNum;
      }
	
   }
   
   //this method changes mixed number into an improper fraction
   public static int[] toImproperFrac(int[] arrayNum){
	   int[] newFraction = {0,0};
	   
	   //multiplies the denominator by the whole number, adds numerator
	   int numerator = (arrayNum[2] * arrayNum[0]) + arrayNum[1]; 
	   
	   newFraction[0] = numerator; //new improper numerator value	
	   newFraction[1] = arrayNum[2];//inputed denominator
	   return newFraction;      
   }
  
   
   public static int[] addSubtractFrac(int[] opOne, int[] opTwo, String operator){
	   int[] answer = {0,0,0};
	   int numeratorOne = opOne[0] * opTwo[1];//cross multiply 1st operand's numerator w/ 2nd operand's denominator
	   int numeratorTwo = opOne[1] * opTwo[0];//cross multiply 1st operand's denominator w/ 2nd operand's numerator
	   int denominator = opOne[1] * opTwo[1];
	   answer[2] = denominator;
	   
	   int newNumerator;
	   if(operator.equals("+")){
		  newNumerator = numeratorOne + numeratorTwo;   
	   }else{
		    newNumerator = numeratorOne - numeratorTwo;
	   }
	   answer[0] = newNumerator / denominator; //Calculation for the whole number
	   answer[1] = newNumerator % denominator; //Calculation for the numerator
	   return answer;
   }
   
   public static int[] multiplyDivideFrac(int[] opOne, int[] opTwo, String operator){
	   int[] answer = {0,0,0}; //This method will always return 3 values
	   
	   /*both the numerator and denominator are set outside the if statement
	    * to stop repetition and is more efficient
	    */
	   int numerator; 
	   int denominator;
	   
	   if(operator.equals("/")){ //if divide, flips the operand Two's numerator and denominator, then multiplies
		   numerator = opOne[0] * opTwo[1];  // multiples after being "flipped"- gets the numerator
		   denominator = opOne[1] * opTwo[0]; // multiples after being "flipped"- gets the denominator
	   }else{
	    numerator = opOne[0] * opTwo[0]; 
	    denominator = opOne[1] * opTwo[1];
	   }
	   
	   int[] wholeNumeratorCalc = toMixedNum(numerator, denominator); //Takes the numerator and denominator and calculates for whole and numerator
	   for(int i = 0; i < 2; i++ ){ //more efficient since answer[0] = wholeNumeratorCalc[0] and answer[1] = wholeNumeratorCalc[1]
		   answer[i] = wholeNumeratorCalc[i];
	   }
	   answer[2] = denominator;
	   
	   return answer;
	   
	   
	   
	   
   }
   //This methods calculates the whole number and numerator
   public static int[] toMixedNum(int numer, int denom){
	   int[] mixedAnswer = {0,0};
	   mixedAnswer[0] = numer / denom; //Calculation for the whole number
	   mixedAnswer[1] = numer % denom; //Calculation for the numerator
	   return mixedAnswer;
   }
   


}


