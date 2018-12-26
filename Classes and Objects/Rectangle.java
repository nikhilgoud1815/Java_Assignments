package javaAssignments;

public class Rectangle {
	private int length;
	private int breadth;
public int area(){
	return length*breadth;
}
public int perimeter(){
	return (length+breadth)*2;
}
public int getBreadth() {
	return breadth;
}
public void setBreadth(int breadth) {
	this.breadth = breadth;
}
public int getLength() {
	return length;
}
public void setLength(int length) {
	this.length = length;
}

}
