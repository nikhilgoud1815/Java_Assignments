package com.capgemini;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class StudentNamesSortingUsingCollectionTest {

	private SortingStudentNamesCollection sortingNames;
	private SortingStudentNamesCollection sortingNamesTwo;
	private SortingStudentNamesCollection sortingNamesThree;
	
	@Before
	public void beforeFunction(){
		 sortingNames=new SortingStudentNamesCollection("nikhil");
		 sortingNamesTwo=new SortingStudentNamesCollection("akhil");
		 sortingNamesThree=new SortingStudentNamesCollection("pavan");
	}
	
	@Test                //TreeSet   sorts in ascending or descending order 
	public void sortingNamesTestUsingTreeSet() {
		TreeSet<Object> treeSet=new TreeSet<Object>();
		treeSet.add(sortingNames.toString());
		treeSet.add(sortingNamesTwo.toString());
		treeSet.add(sortingNamesThree.toString());
		Iterator<Object> iteration=treeSet.iterator();
		while(iteration.hasNext())
		{
			System.out.println(iteration.next());
		}
		
	}
	@Test                //list sorts in insertion order 
	public void sortingNamesTestUsingList() {
		List<Object> treeSet=new ArrayList<Object>();
		treeSet.add(sortingNames.toString());
		treeSet.add(sortingNamesTwo.toString());
		treeSet.add(sortingNamesThree.toString());
		Iterator<Object> iteration=treeSet.iterator();
		while(iteration.hasNext())
		{
			System.out.println(iteration.next());
		}

}}
