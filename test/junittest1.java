package test;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Test;

public class junittest1 {
	static String result1;

	public static String replaceLettersWithPosition(String input) {
		StringBuffer result2 = new StringBuffer();
		String result = input;
		result.toUpperCase()
		.chars().mapToObj(x -> (int) x - 64)
		.filter(x -> (x >= 1 && x <= 26))
		.forEach(x -> result2.append(x + " "));
		System.out.println(result2);
		return result2.toString();
	}

/*	
	// check to see there is a return type as string
	@Test
	public void test1_checkingInput() {
		if (replaceLettersWithPosition("test input") == "test input") {
			System.out.println("Test1 passed. Output is String");
		} else {
			fail("Return type is not a string");
		}
	}
*/
	
	
	// compare return with correct answer to check for accuracy
	// done multiple times to ensure answer is not correct by chance
	@Test
	public void test2_checkingAnswer() {
		if (replaceLettersWithPosition("abc").equals("1 2 3 ")) {
			System.out.println("Test2 passed. Correct Answer");
		} else {
			System.out.println("Answer to test2 is incorrect. Correct answer should be:");
			System.out.println("1 2 3");
			fail("Incorrect Answer, check logic");
		}
	}

	@Test
	public void test3_checkingAnswer2() {
		if (replaceLettersWithPosition("uegclwqr0423£$^").equals("21 5 7 3 12 23 17 18 ")) {
			System.out.println("Test3 passed. Correct Answer");
		} else {
			System.out.println("Answer to test3 is incorrect");
			fail("Incorrect Answer, check logic");
		}
	}

	@Test
	public void test4_checkingAnswer3() {
		if (replaceLettersWithPosition("357659%^*£^*%").equals("")) {
			System.out.println("Test4 passed. Correct Answer");
		} else {
			System.out.println("Answer to test4 is incorrect");
			fail("Incorrect Answer, check logic");
		}
	}
}
