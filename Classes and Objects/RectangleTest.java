package javaAssignments;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
public class RectangleTest {
	private Rectangle variableMeasure;
	@Before
	public void setUp() {
	variableMeasure=new Rectangle();
	variableMeasure.setLength(2);
	variableMeasure.setBreadth(3);
	}
	
	@Test
	public void test() {
		assertEquals(6,variableMeasure.area());
	}
	@Test
	public void testTwo() {
		assertEquals(10,variableMeasure.perimeter());
	}
}
