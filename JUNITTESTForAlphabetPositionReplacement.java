import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.*;
import org.junit.jupiter.api.Test;



class junittest1 {
	
	
	int a=1;
	@Before
	public void pretest() {
		System.out.print("Starting test " + a);
	}
	

	//check to see there is a return type as string
	public void test1_checkingInput() {
		if (replaceLettersWithPosition("test input")=="test input") {
			System.out.println("Output is String");
		}
		else {
			fail("Return type is not a string");
		}
		
	}
	
	//compare return with correct answer to check for accuracy
	//done multiple times to ensure answer is not correct by chance
	public void test2_checkingAnswer() {
		if (replaceLettersWithPosition("a b c abc 123.,/[")=="1 2 3 1 2 3") {
			System.out.print("Correct Answer");
		}
		else {
			fail("Incorrect Answer, check logic");
		}
	}
	

	public void test2_checkingAnswer2() {
		if (replaceLettersWithPosition("uegclwqr0423£$^")=="21 5 7 3 12 23 17 18 ") {
			System.out.print("Correct Answer");
		}
		else {
			fail("Incorrect Answer, check logic");
		}
	}
	
	public void test2_checkingAnswer3() {
		if (replaceLettersWithPosition("357659%^*£^*%")=="") {
			System.out.print("Correct Answer");
		}
		else {
			fail("Incorrect Answer, check logic");
		}
	}
	
	@After
	public void posttest() {
		System.out.print("End of test " + a);
		a++;
	}

}
