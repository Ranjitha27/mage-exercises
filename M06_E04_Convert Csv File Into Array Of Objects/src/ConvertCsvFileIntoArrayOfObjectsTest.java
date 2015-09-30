import static org.junit.Assert.*;

import org.junit.Test;

public class ConvertCsvFileIntoArrayOfObjectsTest {

	@Test
	public void UTC_01() {
		assertNull(ConvertCsvFileIntoArrayOfObjects.convert(""));
	}

	@Test
	public void UTC_02() {
		Object[][] expecteds = new Object[0][];
		Object[][] actuals = ConvertCsvFileIntoArrayOfObjects
				.convert("emptyfile.txt");
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void UTC_03() {
		Object[][] expecteds = { 
				{ "Vinod", "Bangalore", 5.8, 41 },
				{ "Shyam", "Bangalore", 6.1, 42 } };
		
		Object[][] actuals = ConvertCsvFileIntoArrayOfObjects
				.convert("mixed.txt");
		assertArrayEquals(expecteds, actuals);
	}

}
