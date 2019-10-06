package PROG1.src;

public class Address {
	
	private String St;
	private String city;
	private String State;
	private String country;
	private int zipCode;

	@Override
	public String toString() {
		return "Address{" +
				"St='" + St + '\'' +
				", city='" + city + '\'' +
				", State='" + State + '\'' +
				", country='" + country + '\'' +
				", zipCode=" + zipCode +
				'}';
	}

	public Address(String st, String city, String state, String country, int zipCode) {
		St = st;
		this.city = city;
		State = state;
		this.country = country;
		this.zipCode = zipCode;
	}

	public String getSt() {
		return St;
	}

	public void setSt(String st) {
		St = st;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
}

