package com.capgemini;

public class StudentFruitKeyValue {
private String name;
public StudentFruitKeyValue(String name){
	this.name=name;
}
@Override
public String toString() {
	return "StudentFruitKeyValue [name=" + name + ", fruitName=" + fruitName
			+ "]";
}
private String fruitName;

}
