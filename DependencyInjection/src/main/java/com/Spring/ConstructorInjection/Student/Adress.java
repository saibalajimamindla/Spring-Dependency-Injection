package com.Spring.ConstructorInjection.Student;

public class Adress {
	
	private int flatnumber;
	private String Area;
	private String landmark;
	private String zipcode;
	
	public Adress(int flatnumber, String area, String landmark, String zipcode) {
		this.flatnumber = flatnumber;
		this.Area = area;
		this.landmark = landmark;
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Adress [flatnumber=" + flatnumber + ", Area=" + Area + ", landmark=" + landmark + ", zipcode=" + zipcode
				+ "]";
	}
	
	

}
