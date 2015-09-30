import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ClassAndObjectEvalTest {

	Student student;

	@Before
	public void init() {
		student = new Student(1122, "Ram");
		student.getMarksData()[0] = new MarksData("Maths", 98);
		student.getMarksData()[1] = new MarksData("Physics", 78);
		student.getMarksData()[2] = new MarksData("Electronics", 89);
	}

	@Test
	public void UTC_01() {
		assertEquals(1122, student.getRollNumber());
		assertEquals(3, student.getMarksData().length);
	}

	@Test
	public void UTC_02() {
		assertEquals(98, student.getMarksData()[0].getMarks());
		assertEquals(78, student.getMarksData()[1].getMarks());
		assertEquals(89, student.getMarksData()[2].getMarks());
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void UTC_03() {
		student.getMarksData()[4].getMarks();
	}

	@Test
	public void UTC_04() {
		student.getMarksData()[0].setMarks(44);
		student.getMarksData()[1].setMarks(44);
		student.getMarksData()[2].setMarks(44);
		
		assertEquals("C", student.getGrade());
	}

	@Test
	public void UTC_05() {
		student.getMarksData()[0].setMarks(14);
		student.getMarksData()[1].setMarks(12);
		student.getMarksData()[2].setMarks(35);
		
		assertEquals("D", student.getGrade());
	}

	@Test
	public void UTC_06() {
		student.setName("Kiran");
		assertEquals("Kiran", student.getName());
	}
}
