package javaAssignments;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;
import org.junit.Before;
import org.junit.Test;
public class DistanceTest {

	private DistanceMeasure distance;
	private DistanceMeasure distance1;
	
	@Before
	public void setUp(){
		distance = new DistanceMeasure(5.1f,6.4f);
		distance1 = new DistanceMeasure(7.2f,8.3f);
	}
	@Test
	public void test() {
		String expectedResult="12.299999 ft 14.700001 in";
		DistanceMeasure answer = DistanceMeasure.sum(distance, distance1);
		answer.display();
	
		assertEquals(expectedResult, answer.feet+" ft "+answer.inches+" in");
	}

}
