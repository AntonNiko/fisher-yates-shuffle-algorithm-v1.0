import java.util.Scanner;

public class Application {
	static Scanner userInput;
	
	public static void main(String[] args){
		String[] arrayInputString,arrayStringShuffled;
		int[] arrayInputInteger,arrayIntegerShuffled;
		
		if(userInputTypeDecision()){
			arrayInputString = getStringArray();
			arrayStringShuffled = Yates.shuffleStringArray(arrayInputString);
			
			// Output the array in a for loop
			for(String element: arrayStringShuffled){
				System.out.print(element+"  ");
			}
		}else{
			arrayInputInteger = getIntegerArray();
			arrayIntegerShuffled = Yates.shuffleIntegerArray(arrayInputInteger);
			
			// Output the array in a for loop
			for(int element: arrayIntegerShuffled){
				System.out.print(element+"  ");
			}
		}
	}
	
	private static boolean userInputTypeDecision(){
		Scanner input;
		String userDecisionInput;
		
		input = new Scanner(System.in);
		System.out.print("String (s) or Integers (any other key): ");
		userDecisionInput = input.nextLine();
		if(userDecisionInput.equals("s")){
			return true;
		}
		return false;
	}
	
	private static String[] getStringArray(){
		String[] data;
		int length, i;
		
		length = inputInteger("Length: ");
		data = new String[length];
		for(i = 0; i < length; i++){
			data[i] = inputString("Element " + i + ":");
		}
		return data;
	}
	
	private static int[] getIntegerArray(){
		int[] data;
		int length, i;
		
		length = inputInteger("Length: ");
		data = new int[length];
		for(i = 0; i < length; i++){
			data[i] = inputInteger("Element " + i + ":");
		}
		return data;
	}
	
	private static String inputString(String prompt){
		String value;
		
		userInput = new Scanner(System.in);
		System.out.print(prompt);	
		value = userInput.nextLine();
		return value;
	}
	
	private static int inputInteger(String prompt){
		int value;
		
		userInput = new Scanner(System.in);
		System.out.print(prompt);
		value = userInput.nextInt();
		return value;
	}
}
