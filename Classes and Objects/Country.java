package javaAssignments;
public class Country 
{
	private String nameOfTheCountry;
	private int population;
	private double area;
	
	public Country(String name,int population,double area){
		this.nameOfTheCountry=nameOfTheCountry;
		this.population=population;
		this.area=area;
	}
	public String getName() {
		return nameOfTheCountry;
	}
	public void setName(String name) {
		this.nameOfTheCountry = name;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public Country maximumPopulation(Country[] objectToStoreValuesOfPopulation)
	{
		Country maxPopulation=objectToStoreValuesOfPopulation[0];
		for(int count=0;count<objectToStoreValuesOfPopulation.length;count++)
		{
			if(objectToStoreValuesOfPopulation[count].population>maxPopulation.population)
			{
				maxPopulation=objectToStoreValuesOfPopulation[count];
			}
			
		}
		return maxPopulation;
	}
	public Country maximumArea(Country[] objectToStoreValuesOfArea)
	{
		Country maxArea=objectToStoreValuesOfArea[0];
		for(int count=0;count<objectToStoreValuesOfArea.length;count++)
		{
			if(objectToStoreValuesOfArea[count].area>maxArea.area)
			{
				maxArea=objectToStoreValuesOfArea[count];
			}
			
		}
		return maxArea;
	}
	public Country maximumDensity(Country[] objectToStoreValuesOfDensity){
		Country maxDensity=objectToStoreValuesOfDensity[0];
		for(int count=0;count<objectToStoreValuesOfDensity.length;count++)
		{
			if(objectToStoreValuesOfDensity[count].population/objectToStoreValuesOfDensity[count].area>maxDensity.population/maxDensity.area)
			{
				maxDensity=objectToStoreValuesOfDensity[count];
			}
			
		}
		return maxDensity;
	}
}

