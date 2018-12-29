package com.capgemini;

public class AscendingOrderOfCars implements Comparable<AscendingOrderOfCars> {
	private String make;
	private String model;
	private int year;
	private int price;

	public AscendingOrderOfCars(String make, String model, int year, int price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int compareTo(AscendingOrderOfCars ascendingOrderOfCars) {

		int value = this.getMake().compareTo(ascendingOrderOfCars.getMake());
		return value;
	}

	@Override
	public String toString() {
		return "AscendingOrderOfCars [make=" + make + ", model=" + model
				+ ", year=" + year + ", price=" + price + "]";
	}

}
