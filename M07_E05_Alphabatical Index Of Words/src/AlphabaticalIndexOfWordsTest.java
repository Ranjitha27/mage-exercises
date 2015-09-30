import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AlphabaticalIndexOfWordsTest {
	
	private AlphabaticalIndexOfWords obj;
	
	@Before
	public void setup(){
		obj = new AlphabaticalIndexOfWords();
	}
	
	@Test
	public void UTC_01(){
		String input = "mahesh and manish are friends";
		String expected = "{a=[and, are], f=[friends], m=[mahesh, manish]}";
		String actual = obj.getResult(input);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void UTC_02(){
		String input = "The Map contains a single letter as key and for each key a set of words starting with that letter";
		String expected = "{M=[Map], T=[The], a=[a, and, as], c=[contains], e=[each], f=[for], k=[key], l=[letter], o=[of], s=[set, single, starting], t=[that], w=[with, words]}";
		String actual = obj.getResult(input);
		
		assertEquals(expected, actual);
	}
}
