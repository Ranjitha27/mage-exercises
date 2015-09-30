import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ConvertInputTest {
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

		String expectedResult = "null";
		String[] args = {};
		ConvertInput.main(args);
		String actualResult = myOutStream.toString();

		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void UTC_02() {

		String expectedResult = "int 123";
		String[] args = { "123" };
		ConvertInput.main(args);
		String actualResult = myOutStream.toString();

		assertEquals(expectedResult, actualResult);
	}

}
