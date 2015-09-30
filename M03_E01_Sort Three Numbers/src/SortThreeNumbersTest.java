import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SortThreeNumbersTest {
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

		String expectedResult = "11 22 33";

		SortThreeNumbers.sort(11, 22, 33);
		String actualResult = myOutStream.toString();

		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void UTC_02() {

		String expectedResult = "-222 10 100";
		SortThreeNumbers.sort(100, -222, 10);
		String actualResult = myOutStream.toString();
		System.out.println("actualResult = " + actualResult);
		assertEquals(expectedResult, actualResult);
	}
}
