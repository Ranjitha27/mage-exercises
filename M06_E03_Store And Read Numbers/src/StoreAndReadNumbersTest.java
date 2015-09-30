import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class StoreAndReadNumbersTest {
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
		String []args = {"29", "pqrs", "49.56", "asdf", "100", "29.3"};
		String expectedResult = "[29.0, 49.56, 100.0, 29.3]\n";
		
		StoreAndReadNumbers.main(args);
		String actualResult = myOutStream.toString();

		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void UTC_02() {
		String []args = {"123"};
		String expectedResult = "[123.0]\n";
		
		StoreAndReadNumbers.main(args);
		String actualResult = myOutStream.toString();

		assertEquals(expectedResult, actualResult);
	}
}
