import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FindTheFutureTimeEvalTest {
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

		String expectedResult = "16:09:47\n";

		obj.addTime(15, 9, 47, 3600);
		String actualResult = myOutStream.toString();

		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void UTC_02() {

		String expectedResult = "00:00:00\n";

		obj.addTime(22, 0, 0, 7200);
		String actualResult = myOutStream.toString();

		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void UTC_03() {

		String expectedResult = "11:12:43\n";

		obj.addTime(11, 9, 23, -200);
		String actualResult = myOutStream.toString();

		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void UTC_04() {

		String expectedResult = "Invalid time input\n";

		obj.addTime(12, 100, 100, -200);
		String actualResult = myOutStream.toString();

		assertEquals(expectedResult, actualResult);
	}
}
