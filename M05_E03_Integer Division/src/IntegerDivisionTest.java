import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class IntegerDivisionTest {
	OutputStream out;
	ByteArrayOutputStream myOutStream;

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

		String expectedResult = "2 inputs were not supplied";
		String[] args = {};
		IntegerDivision.main(args);
		String actualResult = myOutStream.toString();

		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void UTC_02() {

		String expectedResult = "Quotient=3";
		String[] args = { "22", "7" };
		IntegerDivision.main(args);
		String actualResult = myOutStream.toString();

		assertEquals(expectedResult, actualResult);
	}
}
