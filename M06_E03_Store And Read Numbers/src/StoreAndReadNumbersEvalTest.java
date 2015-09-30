import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class StoreAndReadNumbersEvalTest {
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
		String []args = {"29", "49.56", "100", "29.3"};
		String expectedResult = "[29.0, 49.56, 100.0, 29.3]\n";
		
		StoreAndReadNumbers.main(args);
		String actualResult = myOutStream.toString();

		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void UTC_02() {
		String []args = {};
		String expectedResult = "[]\n";
		
		StoreAndReadNumbers.main(args);
		String actualResult = myOutStream.toString();

		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void UTC_03() {
		String []args = {"asd", "qwe", "zxc"};
		String expectedResult = "[]\n";
		
		StoreAndReadNumbers.main(args);
		String actualResult = myOutStream.toString();

		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void UTC_04() {
		String []args = {"a", "b", "c", "d", "e", "1.2"};
		String expectedResult = "[1.2]\n";
		
		StoreAndReadNumbers.main(args);
		String actualResult = myOutStream.toString();

		assertEquals(expectedResult, actualResult);
	}
}
