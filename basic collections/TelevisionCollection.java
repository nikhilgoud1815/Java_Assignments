package com.capgemini;

public class TelevisionCollection {
	private String company, type;

	
	public TelevisionCollection(String company, String type,
			boolean threeDenabled, int price) {
		super();
		this.company = company;
		this.type = type;
		ThreeDenabled = threeDenabled;
		this.price = price;
	}

	@Override
	public String toString() {
		return "TelevisionCollection [company=" + company + ", type=" + type
				+ ", ThreeDenabled=" + ThreeDenabled + ", price=" + price + "]";
	}

	private boolean ThreeDenabled;
	private int price;


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + price;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TelevisionCollection other = (TelevisionCollection) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (price != other.price)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
}
