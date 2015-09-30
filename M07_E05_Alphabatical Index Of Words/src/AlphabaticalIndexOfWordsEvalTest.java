import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AlphabaticalIndexOfWordsEvalTest {
	
	private AlphabaticalIndexOfWords obj;
	
	@Before
	public void setup(){
		obj = new AlphabaticalIndexOfWords();
	}
	
	@Test
	public void UTC_01(){
		String input = "quick brown fox jumps over the lazy dog";
		String expected = "{b=[brown], d=[dog], f=[fox], j=[jumps], l=[lazy], o=[over], q=[quick], t=[the]}";
		String actual = obj.getResult(input);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void UTC_02(){
		String input = "";
		String expected = "null";
		String actual = obj.getResult(input);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void UTC_03(){
		String input = null;
		String expected = "null";
		String actual = obj.getResult(input);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void UTC_04(){
		String input = "anil arun vinod vishal vikas bhaskar bhavana";
		String expected = "{a=[anil, arun], b=[bhaskar, bhavana], v=[vikas, vinod, vishal]}";
		String actual = obj.getResult(input);
		
		assertEquals(expected, actual);
	}
}
