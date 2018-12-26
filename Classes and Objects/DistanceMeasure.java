package javaAssignments;

public class DistanceMeasure {
	float feet;
	float inches;
	
	public DistanceMeasure() {
	}

	public DistanceMeasure(float feet, float inches) {
		this.feet=feet;
		this.inches=inches;
	}
	
	public void display(){
		System.out.println(feet+" ft "+inches+" in");;
	}

	public static DistanceMeasure sum(DistanceMeasure distance, DistanceMeasure distance1) {
		DistanceMeasure result = new DistanceMeasure();
		result.feet=distance.feet+distance1.feet;
		result.inches=distance.inches+distance1.inches;
		return result;
	}

}
