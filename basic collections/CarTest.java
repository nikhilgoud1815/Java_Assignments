package com.capgemini;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class CarTest {
	private Car car;
	private Car carTwo;
	private Car carThree;

	@Before
	public void carTestBefore() {
		car = new Car("Hyundai", "i20", 2018, 10000);
		carTwo = new Car("Hyundai", "i20", 2019, 1000015);
		carThree = new Car("Maruti", "i10", 2019, 1000015);
	}

	@Test                   //removes duplicates by using HashSet
	public void testCarUsingHashSet() {
		HashSet<Object> set = new HashSet<Object>();
		set.add(car);
		set.add(carTwo);
		set.add(carThree);
		Iterator<Object> iteration = set.iterator();
		while (iteration.hasNext()) {
			System.out.println(iteration.next());
		}
	}

	@Test                 //ArrayList prints all the elements and doesn't remove duplicates
	public void laptopTestUsingList() {
		ArrayList<Object> set = new ArrayList<Object>();
		set.add(car);
		set.add(carTwo);
		set.add(carThree);
		Iterator<Object> iteration = set.iterator();
		while (iteration.hasNext()) {
			System.out.println(iteration.next());
		}

	}
}
