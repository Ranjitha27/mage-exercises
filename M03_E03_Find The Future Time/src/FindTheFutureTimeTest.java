import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FindTheFutureTimeTest {
	OutputStream out;
	ByteArrayOutputStream myOutStream;
	FindTheFutureTime obj;

	@Before
	public void init() {
		obj = new FindTheFutureTime();
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

		String expectedResult = "05:12:53\n";

		obj.addTime(05, 9, 33, -200);
		String actualResult = myOutStream.toString();

		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void UTC_02() {

		String expectedResult = "Invalid time input\n";

		obj.addTime(12, 100, 100, -200);
		String actualResult = myOutStream.toString();

		assertEquals(expectedResult, actualResult);
	}
}
