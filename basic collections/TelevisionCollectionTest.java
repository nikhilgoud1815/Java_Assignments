package com.capgemini;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class TelevisionCollectionTest 
{

		private TelevisionCollection television;
		private TelevisionCollection televisionTwo;
		private TelevisionCollection televisionThree;
		
		@Before
		public void televisionTest(){
			television=new TelevisionCollection("Sony","LED",true,15000);
			televisionTwo=new TelevisionCollection("Sony","LED",false,15000);
			televisionThree=new TelevisionCollection("Sony","LCD",true,15000);
		}
		
	@Test                         //removes duplicates by using HashSet
	public void testTelevisionCollectionUsingHashSet() {
		HashSet<Object> set = new HashSet<Object>();
		set.add(television);
		set.add(televisionTwo);
		set.add(televisionThree);
		Iterator<Object> iteration = set.iterator();
		while (iteration.hasNext()) {
			System.out.println(iteration.next());
		}
	}
	@Test                 //ArrayList prints all the elements and doesn't remove duplicates
	public void laptopTestUsingList() {
		ArrayList<Object> set = new ArrayList<Object>();
		set.add(television);
		set.add(televisionTwo);
		set.add(televisionThree);
		Iterator<Object> iteration = set.iterator();
		while (iteration.hasNext()) {
			System.out.println(iteration.next());
		}

	}

}
