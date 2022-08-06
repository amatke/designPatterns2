package adapterPattern;

public class Address {

	public String street;
	public int number;
	public String country;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address{" +
			"street='" + street + '\'' +
			", number=" + number +
			", country='" + country + '\'' +
			'}';
	}
}
