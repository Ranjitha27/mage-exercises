import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class SumAndAverageOfInputsEvalTest {

	OutputStream out;
	ByteArrayOutputStream myOutStream;

	SumAndAverageOfInputs obj;
	@Before
	public void init() {
		out = System.out;
		myOutStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(myOutStream));
	}

	@After
	public void clean() {
		System.setOut((PrintStream) out);
	}
	
	@Test
	public void UTC_01() {

		String []args = {"4", "1", "2", "3", "4", "5"};
		String expectedResult = "THE SUM IS 10.0\n";
		expectedResult += "THE AVERAGE IS 2.5\n";
		expectedResult += "NUMERICAL INPUTS 4\n";
		expectedResult += "NON NUMERICAL INPUTS 0\n";
		
		SumAndAverageOfInputs.main(args);
		String actualResult = myOutStream.toString();

		assertEquals(expectedResult, actualResult);
	}

	
	@Test
	public void UTC_02() {

		String []args = {"6", "10", "20"};
		String expectedResult = "INSUFFICIENT INPUTS\n";
		
		SumAndAverageOfInputs.main(args);
		String actualResult = myOutStream.toString();

		assertEquals(expectedResult, actualResult);
	}

	
	@Test
	public void UTC_03() {

		String []args = {"-12", "asd", "123"};
		String expectedResult = "FIRST ARGUMENT SHOULD BE >0\n";
		
		SumAndAverageOfInputs.main(args);
		String actualResult = myOutStream.toString();

		assertEquals(expectedResult, actualResult);
	}

	
	@Test
	public void UTC_04() {

		String []args = {"2", "asd", "sdf"};
		String expectedResult = "THE SUM IS 0.0\n";
		expectedResult += "THE AVERAGE IS NaN\n";
		expectedResult += "NUMERICAL INPUTS 0\n";
		expectedResult += "NON NUMERICAL INPUTS 2\n";
		
		SumAndAverageOfInputs.main(args);
		String actualResult = myOutStream.toString();

		assertEquals(expectedResult, actualResult);
	}
}
