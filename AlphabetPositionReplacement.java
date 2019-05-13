public class AlphabetPositionReplacement {
	static String result1;


	public String replaceLettersWithPosition(String input) {
		StringBuffer result2 = new StringBuffer();
		String result = input;
		result.toUpperCase().chars().mapToObj(x -> (int) x - 64).filter(x -> (x >= 1 && x <= 26))
		.forEach(x -> result2.append(x + " "));
		System.out.println(result2);
		return result2.toString();
	}

}