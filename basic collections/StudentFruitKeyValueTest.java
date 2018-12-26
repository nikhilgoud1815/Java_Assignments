package com.capgemini;

import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.Test;

public class StudentFruitKeyValueTest {
	/*private StudentFruitKeyValue ObjectOne;
	private StudentFruitKeyValue ObjectTwo;
	private StudentFruitKeyValue ObjectThree;
	private StudentFruitKeyValue ObjectFour;*/

	@Test
	// HashMap which is used for key value pairs
	public void keyValueTestForNullValues() {
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("nikhil", "mango");
		hashMap.put("pavan", "strawberry");
		
		for (Map.Entry m : hashMap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println(hashMap.get("harish"));
	}
	
	@Test
	// HashMap which is used for key value pairs
	public void keyValueTest() {
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("nikhil", "mango");
		hashMap.put("pavan", "strawberry");
		
		for (Map.Entry m : hashMap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println(hashMap.get("nikhil"));
	}

}
