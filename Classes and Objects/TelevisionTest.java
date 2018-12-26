package javaAssignments;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class TelevisionTest
{
private Television televisionInstance;
	@Before
	public void setUp()
	{
	   televisionInstance=new Television(true,100);
	}

	@Test
	public void stateTest()
	{
		assertEquals(true,televisionInstance.checkState());
	}
	
	@Test
	public void volumeIncrementDisplay()
	{
		assertEquals(1,televisionInstance.increaseVolume());
	}
	
	@Test
	public void volumeDecrementDisplay() 
	{
		assertEquals(0,televisionInstance.decreaseVolume());
	}

	@Test
	public void channelDisplay()
	{
		assertEquals(100,televisionInstance.currentChannel());
	}
	
	@Test
	public void channelChange() 
	{
		assertEquals(101,televisionInstance.changeChannel());
	}
	
	@Test
	public void stateChange() 
	{
		assertEquals(false,televisionInstance.changeState());
	}
}
