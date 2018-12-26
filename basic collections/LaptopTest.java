package com.capgemini;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

public class LaptopTest {
	private Laptop laptop;
	private Laptop laptopTwo;
	private Laptop laptopThree;

	@Before
	public void laptopTestBefore() {
		laptop = new Laptop("HP", "intel5", "windows7", "16 bit processor");
		laptopTwo = new Laptop("HP", "intel5", "windows7", "16 bit processor");
		laptopThree = new Laptop("HP", "intel7", "windows7", "16 bit processor");
	}

	@Test                           //removes duplicates by using HashSet
	public void laptopTestUsingHashSet() {
		HashSet<Object> set = new HashSet<Object>();
		set.add(laptop);
		set.add(laptopTwo);
		set.add(laptopThree);
		Iterator<Object> iteration = set.iterator();
		while (iteration.hasNext()) {
			System.out.println(iteration.next());
		}
	}

	@Test                  //ArrayList prints all the elements and doesn't remove duplicates
	public void laptopTestUsingList() {
		ArrayList<Object> set = new ArrayList<Object>();
		set.add(laptop);
		set.add(laptopTwo);
		set.add(laptopThree);
		Iterator<Object> iteration = set.iterator();
		while (iteration.hasNext()) {
			System.out.println(iteration.next());
		}

	}

}
