package javaAssignments;

public class Triangle {
	private int sideOne;
	public Triangle(int sideOne, int sideTwo, int sideThree) {
		
		this.sideOne = sideOne;
		this.sideTwo = sideTwo;
		this.sideThree = sideThree;
	}
	private int sideTwo;
	private int sideThree;
	public int getSideOne() {
		return sideOne;
	}
	
	public void setSideOne(int sideOne) {
		this.sideOne = sideOne;
	}
	public int getSideTwo() {
		return sideTwo;
	}
	public void setSideTwo(int sideTwo) {
		this.sideTwo = sideTwo;
	}
	public int getSideThree() {
		return sideThree;
	}
	public void setSideThree(int sideThree) {
		this.sideThree = sideThree;
	}
	public boolean isRight(){
		double storeFirstSide=Math.pow(sideOne,2);
		double storeSecondSide=Math.pow(sideTwo,2);
		double storeThirdSide=Math.pow(sideThree,2);
		if( ((storeFirstSide+storeSecondSide)==storeThirdSide) || ((storeThirdSide+storeSecondSide)==storeFirstSide) || ((storeFirstSide+storeThirdSide)==storeSecondSide)){
			return true;
		}
		else
		{
			return false;
		}	
	}
	public boolean isScalene(){
		if(sideOne!=sideTwo && sideTwo!=sideThree && sideThree!=sideOne){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean isIsosceles(){
		if(((sideOne==sideTwo)&&(sideTwo!=sideThree)) || ((sideThree==sideTwo)&&(sideOne!=sideThree)) || ((sideThree==sideTwo)&&(sideOne!=sideThree))){
			return true;	
		}
	else {
		return false;
	}
	}
	public boolean isEquilateral(){
		if((sideOne==sideTwo) && (sideTwo==sideThree) && (sideThree==sideOne))
		{
			return true;
		}
		else{
			return false;
		}
	}
}
