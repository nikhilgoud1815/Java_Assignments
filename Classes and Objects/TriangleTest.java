package javaAssignments;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class TriangleTest
{
	private Triangle triangleObjectForSides;

	@Test
	public void isRightTest() {
		triangleObjectForSides=new Triangle(4,3,5);
		assertEquals(true,triangleObjectForSides.isRight());
	}

	@Test
	public void isScaleneTest() {
		triangleObjectForSides=new Triangle(4,3,5);
		assertEquals(true,triangleObjectForSides.isScalene());
	}
	@Test
	public void isIsoscelesTest() {
		triangleObjectForSides=new Triangle(4,4,5);
		assertEquals(true,triangleObjectForSides.isIsosceles());
	}
	@Test
	public void isEquilateralTest() {
		triangleObjectForSides=new Triangle(4,4,4);
		assertEquals(true,triangleObjectForSides.isEquilateral());
	}
}
