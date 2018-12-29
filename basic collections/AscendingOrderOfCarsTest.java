package com.capgemini;

import static org.junit.Assert.*;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class AscendingOrderOfCarsTest {

	private AscendingOrderOfCars carsOne,carsTwo,carsThree;  //creates objects for class AscendingOrderOfCars
	
	@Before
	public void carsTestPassvalues(){
		carsOne=new AscendingOrderOfCars("Maruti","Ciaz",2015,1000000);
		carsTwo=new AscendingOrderOfCars("Hyundai","I20",2018,1500000);
		carsThree=new AscendingOrderOfCars("Audi","A4",2019,15000000);
	}

	@Test
	public void carsSortingOrder() {
		List<AscendingOrderOfCars> set=new ArrayList<AscendingOrderOfCars>();
		set.add(carsOne);
		set.add(carsTwo);
		set.add(carsThree);
		Collections.sort(set);;
		for(AscendingOrderOfCars list:set){ //for each loop which is used to get properties in set to the object list
			System.out.println(list);
			
		}

	}

}
