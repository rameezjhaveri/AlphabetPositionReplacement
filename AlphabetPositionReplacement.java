public class AlphabetPositionReplacement {

	
	public static void main(String abc[]) {
		replaceLettersWithPosition("uegclwqr0423121vgsd£$^");
	}
	
	public static String replaceLettersWithPosition(String input) {
		StringBuffer resultString = new StringBuffer();
		input.toUpperCase()								//String to uppercase
		.chars()										//Converts string to asci code of there characters and starts a stream
		.mapToObj(x -> (int) x - 64)					//Removing a fixed value from asci value to map letters from 1 - 26
		.filter(x -> (x >= 1 && x <= 26))				//Removes all values that are not between 1 - 26
		.forEach(x -> resultString.append(x + " "));	//Adds each element into the resultstring variable
		System.out.println(resultString);				//Prints result
		return resultString.toString();					//Returns result back to caller
	}

}