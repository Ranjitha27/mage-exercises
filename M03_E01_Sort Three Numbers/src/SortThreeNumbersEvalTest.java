import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SortThreeNumbersEvalTest {
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

		String expectedResult = "10 20 30";
		SortThreeNumbers.sort(10, 20, 30);
		String actualResult = myOutStream.toString();

		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void UTC_02() {

		String expectedResult = "10 20 30";
		SortThreeNumbers.sort(10, 30, 20);
		String actualResult = myOutStream.toString();

		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void UTC_03() {

		String expectedResult = "10 20 30";
		SortThreeNumbers.sort(20, 10, 30);
		String actualResult = myOutStream.toString();

		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void UTC_04() {

		String expectedResult = "10 20 30";
		SortThreeNumbers.sort(20, 30, 10);
		String actualResult = myOutStream.toString();

		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void UTC_05() {

		String expectedResult = "10 20 30";
		SortThreeNumbers.sort(30, 10, 20);
		String actualResult = myOutStream.toString();

		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void UTC_06() {

		String expectedResult = "-20 10 30";
		SortThreeNumbers.sort(30, -20, 10);
		String actualResult = myOutStream.toString();
		System.out.println("actualResult = " + actualResult);
		assertEquals(expectedResult, actualResult);
	}
}
