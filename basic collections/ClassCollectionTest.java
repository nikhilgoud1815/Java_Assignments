package com.capgemini;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class ClassCollectionTest {
	private ClassCollection classCollection;
	private ClassCollection classCollectionTwo;
	private ClassCollection classCollectionThree;

	@Before
	public void laptopTestBefore() {
		classCollection = new ClassCollection("sgs", "dubbak", "siddipet", 2);
		classCollectionTwo = new ClassCollection("sgs", "dubbak", "siddipet",23);
		classCollectionThree = new ClassCollection("chaithanya", "hyd","delhi", 2);
	}

	@Test
	// removes duplicates by using HashSet
	public void testUsingHashSet() {
		HashSet<Object> set = new HashSet<Object>();
		set.add(classCollection);
		set.add(classCollectionTwo);
		set.add(classCollectionThree);
		Iterator<Object> iteration = set.iterator();
		while (iteration.hasNext()) {
			System.out.println(iteration.next());
		}
	}
	@Test                 //ArrayList prints all the elements and doesn't remove duplicates
	public void laptopTestUsingList() {
		ArrayList<Object> set = new ArrayList<Object>();
		set.add(classCollection);
		set.add(classCollectionTwo);
		set.add(classCollectionThree);
		Iterator<Object> iteration = set.iterator();
		while (iteration.hasNext()) {
			System.out.println(iteration.next());
		}
	}

}
