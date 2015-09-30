import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ClassAndObjectTest {

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
		assertEquals("Ram", student.getName());
		assertEquals("A+", student.getGrade());
	}

	@Test
	public void UTC_02() {
		assertEquals("Maths", student.getMarksData()[0].getSubject());
		assertEquals("Physics", student.getMarksData()[1].getSubject());
		assertEquals("Electronics", student.getMarksData()[2].getSubject());
	}

}
