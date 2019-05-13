package test;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class junittest1 {
	static String result1;
	
	public static String replaceLettersWithPosition(String input) {
		return input;
	}
	
	
	//check to see there is a return type as string
	@Test
	public void test1_checkingInput() {
		if (replaceLettersWithPosition("test input")=="test input") {
			System.out.println("Test1 passed. Output is String");
		}
		else {
			fail("Return type is not a string");
		}
	}
	
	//compare return with correct answer to check for accuracy
	//done multiple times to ensure answer is not correct by chance
	@Test
	public void test2_checkingAnswer() {
		if (replaceLettersWithPosition("a b c abc 123.,/[")=="1 2 3 1 2 3") {
			System.out.println("Correct Answer");
		}
		else {
			System.out.println("Answer to test2 is incorrect");
			fail("Incorrect Answer, check logic");
		}
	}
	
	@Test
	public void test3_checkingAnswer2() {
		if (replaceLettersWithPosition("uegclwqr0423£$^")=="21 5 7 3 12 23 17 18 ") {
			System.out.println("Correct Answer");
		}
		else {
			System.out.println("Answer to test3 is incorrect");
			fail("Incorrect Answer, check logic");
		}
	}
	
	@Test
	public void test4_checkingAnswer3() {
		if (replaceLettersWithPosition("357659%^*£^*%")=="") {
			System.out.println("Correct Answer");
		}
		else {
			System.out.println("Answer to test4 is incorrect");
			fail("Incorrect Answer, check logic");
		}
	}
}
