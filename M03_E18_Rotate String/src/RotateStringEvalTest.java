import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RotateStringEvalTest {

	RotateString obj;
	
	@Before
	public void init(){
		obj = new RotateString();
	}
	
	@Test 
	public void UTC_01(){
		String expected = "name is vinod kumar my";
		String input = "my name is vinod kumar";
		String actual = obj.rotate(input, 4);
		assertEquals(expected, actual);
	}
	
	@Test 
	public void UTC_02(){
		String expected = "java programming language";
		String input = "java programming language";
		String actual = obj.rotate(input, 3);
		assertEquals(expected, actual);
	}
	
	@Test 
	public void UTC_03(){
		String expected = "programming language java";
		String input = "java programming language";
		String actual = obj.rotate(input, -5);
		assertEquals(expected, actual);
	}
	
	@Test 
	public void UTC_04(){
		String expected = "java";
		String input = "java";
		String actual = obj.rotate(input, 10);
		assertEquals(expected, actual);
	}
	
	@Test 
	public void UTC_05(){
		String expected = null;
		String input = null;
		String actual = obj.rotate(input, 10);
		assertEquals(expected, actual);
	}
	
	@Test 
	public void UTC_06(){
		String expected = "   ";
		String input = "   ";
		String actual = obj.rotate(input, 10);
		assertEquals(expected, actual);
	}
}
