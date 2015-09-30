import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;


public class ConvertCsvFileIntoArrayOfObjectsEvalTest {

	@Test
	public void UTC_01() {
		assertNull(ConvertCsvFileIntoArrayOfObjects.convert(null));
	}

	@Test
	public void UTC_02() {
		Object[][] expecteds = { 
				{ 1.2,3.4,5.6},
				{1e2,2e-3,1.00009,2.00008 } };
		
		Object[][] actuals = ConvertCsvFileIntoArrayOfObjects
				.convert("doubles.txt");
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void UTC_03() {
		Object[][] expecteds = { 
				{ 100,200,300},
				{1,2,3,4},
				{1234,5678,9012345 } };
		
		Object[][] actuals = ConvertCsvFileIntoArrayOfObjects
				.convert("integers.txt");
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void UTC_04() {
		Object[][] expecteds = { 
				{ "Vinod","Bangalore","Karnataka"},
				{"Nived varma","Nagpur", "Maharashtra"},
				{"Dayanand", "Haveri", "Karnataka" } };
		
		Object[][] actuals = ConvertCsvFileIntoArrayOfObjects
				.convert("strings.txt");
		assertArrayEquals(expecteds, actuals);
	}
}
