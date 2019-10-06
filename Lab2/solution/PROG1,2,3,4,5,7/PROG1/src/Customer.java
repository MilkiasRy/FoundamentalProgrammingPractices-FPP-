package PROG1.src;

public class Customer{
	private String firstName;
	private String lastname;
	private String socSecurtyNum;

	public Customer(String firstName, String lastname, String socSecurtyNum) {
		this.firstName = firstName;
		this.lastname = lastname;
		this.socSecurtyNum = socSecurtyNum;
	}

	private Address billingAddress;
    private Address shippingAddress;
	public Address getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}
	public Address getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public String getFirstName() {
		return firstName;
	}
	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastname=" + lastname + ", socSecurtyNum=" + socSecurtyNum + "]";
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getSocSecurtyNum() {
		return socSecurtyNum;
	}
	public void setSocSecurtyNum(String socSecurtyNum) {
		this.socSecurtyNum = socSecurtyNum;
	}


}
