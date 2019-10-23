package bin_io;

import java.io.Serializable;

public class Address /* implements Serializable */{
	private String city,cellNo;

	public Address(String city, String cellNo) {
		super();
		this.city = city;
		this.cellNo = cellNo;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", cellNo=" + cellNo + "]";
	}
	
}
