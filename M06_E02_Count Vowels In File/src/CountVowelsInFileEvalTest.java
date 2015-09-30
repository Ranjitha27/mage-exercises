import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CountVowelsInFileEvalTest {

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
		String []args = {};
		String expectedResult = "Exactly one argument expected\n";
		
		CountVowelsInFile.main(args);
		String actualResult = myOutStream.toString();

		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void UTC_02() {
		String []args = {"file3.txt"};
		String expectedResult = "10\n";
		
		CountVowelsInFile.main(args);
		String actualResult = myOutStream.toString();

		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void UTC_03() {
		String []args = {"file4.txt"};
		String expectedResult = "0\n";
		
		CountVowelsInFile.main(args);
		String actualResult = myOutStream.toString();

		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void UTC_04() {
		String []args = {"file5.txt"};
		String expectedResult = "251\n";
		
		CountVowelsInFile.main(args);
		String actualResult = myOutStream.toString();

		assertEquals(expectedResult, actualResult);
	}
	
}
