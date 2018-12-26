package com.capgemini;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class CellphoneTest {
	private CellPhone cellPhone;
	private CellPhone cellPhoneTwo;
	private CellPhone cellPhoneThree;

	@Before
	public void laptopTestBefore() {
		cellPhone= new CellPhone("Vivo", "v9", "vivo-v9", "nogout",23000);
		cellPhoneTwo = new CellPhone("Vivo", "v9", "vivo-v9", "nogout",23000);
		cellPhoneThree = new CellPhone("Vivo", "v7", "vivo-v9", "nogout",23000);
		}
	

	@Test   //removes duplicates by using HashSet
	public void testUsingHashSet() {
		HashSet<Object> set = new HashSet<Object>();
		set.add(cellPhone);
		set.add(cellPhoneTwo);
		set.add(cellPhoneThree);
		Iterator<Object> iteration = set.iterator();
		while (iteration.hasNext()) {
			System.out.println(iteration.next());
		}
	}
	@Test                 //ArrayList prints all the elements and doesn't remove duplicates
	public void laptopTestUsingList() {
		ArrayList<Object> set = new ArrayList<Object>();
		set.add(cellPhone);
		set.add(cellPhoneTwo);
		set.add(cellPhoneThree);
		Iterator<Object> iteration = set.iterator();
		while (iteration.hasNext()) {
			System.out.println(iteration.next());
		}
	}

}
