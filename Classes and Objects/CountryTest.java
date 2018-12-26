package javaAssignments;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
public class CountryTest 
{
	private Country countryOne;
	private Country countryTwo;
	private Country countryThree;
	Country country[];
	
	@Before
	public void setUp()
	{
		countryOne=new Country("India",15000,300.50);
		countryTwo=new Country("Australia",25000,250.50);
		countryThree = new Country("Pakistan",2000,50.50);
		country=new Country[3];
		country[0]=countryOne;
		country[1]=countryTwo;
		country[2]=countryThree;
	}
	
	@Test
	public void largestPopulationTest(){
		assertEquals(countryTwo,countryTwo.maximumPopulation(country));
	}
	
	@Test
	public void largestAreaTest()
	{
		assertEquals(countryOne,countryTwo.maximumArea(country));
	}
	
	@Test
	public void densityTest()
	{
		assertEquals(countryTwo,countryTwo.maximumDensity(country));
	}
	
	
	
	
}