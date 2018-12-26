package com.capgemini;

public class Date {
	private int day;
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	private int month;
	private int year;

	public Date(int date, int month, int year) {
		this.day = date;
		this.month = month;
		this.year = year;
	}

	public String toString() {
		return day + "/" + month + "/" + year;
	}

	public boolean isSmaller(Date date)
	{
		Date newDate = new Date(11, 05, 2019);
		if (date.day < newDate.day) {
			return true;
		} 
		else 
		{
			return false;
		}
	}

	public int[] difference(Date date) {
		Date fullDate = new Date(11, 05, 2019);
		int toStoreDate = fullDate.day - date.day;
		int toStoreMonth = fullDate.month - date.month;
		int toStoreYear = fullDate.year - date.year;
		int difference[] = { toStoreDate, toStoreMonth, toStoreYear };
		return difference;
	}
}
