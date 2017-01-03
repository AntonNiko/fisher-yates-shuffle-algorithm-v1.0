import java.util.Random;

public class Yates {
	public static String[] shuffleStringArray(String[] array){
		Random randGen;
		int boundary, baseIndex, newIndex;
		
		boundary = array.length-1;
		randGen = new Random();
		while( boundary != 0){
			baseIndex = boundary;
			newIndex = randGen.nextInt(baseIndex);
			switchStringElements(array, baseIndex, newIndex);
			--boundary;
		}
		return array;
	}
	
	public static int[] shuffleIntegerArray(int[] array){
		Random randGen;
		int boundary, baseIndex, newIndex;
		
		boundary = array.length-1;
		randGen = new Random();
		while(boundary != 0){
			baseIndex = boundary;
			newIndex = randGen.nextInt(baseIndex);
			switchIntegerElements(array, baseIndex, newIndex);
			--boundary;
		}
		return array;
	}
	
	private static String[] switchStringElements(String[] array, int baseIndex, int newIndex){
		String newIndexValue;
		
		newIndexValue = array[baseIndex];
		array[baseIndex] = array[newIndex]; 
		array[newIndex] = newIndexValue;		
		return array;
	}
	
	private static int[] switchIntegerElements(int[] array, int baseIndex, int newIndex){
		int newIndexValue;
		
		newIndexValue = array[baseIndex];
		array[baseIndex] = array[newIndex]; 
		array[newIndex] = newIndexValue;
		return array;
	}
}
