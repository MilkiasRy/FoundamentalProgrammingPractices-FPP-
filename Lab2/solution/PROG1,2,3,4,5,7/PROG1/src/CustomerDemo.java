package PROG1.src;

public class CustomerDemo {


	public static void main(String[] args) {

		Customer customer1 = new Customer("MILKIAS", "GHEBREMARIAM", "45-12-678");
		Customer customer2 = new Customer("HANA", "YEMANE", "675-123-6785");

		String information = customer1.toString();

//add1Ashipping
		//add1Bshipping
		Address address1 = new Address("3571 LAFAYETTE ST ","SANATA CLARA","CA","USA",95045);

		Address address2= new Address(" 5400 N LAKEDWOOD", "CHICAGO", "ILLINO", "USA",52556);


		Address address3= new Address("2341 San tomas st","Sunnyville","CA","USA",96432);

		Address address4= new Address(" lala", "Fairfield", "Iowa", "USA",97632);

		customer1.setBillingAddress(address3);
		customer2.setBillingAddress(address4);
		customer1.setShippingAddress(address1);
		customer2.setShippingAddress(address2);
		System.out.println(information + '\n' + "Billing Address" + customer1.getBillingAddress().toString() + '\n' + "Shipping Address" + customer1.getShippingAddress().toString());
		System.out.println(customer2.toString() + '\n' + "Billing Address" + customer2.getBillingAddress().toString() + '\n' + "Shipping Address" + customer2.getShippingAddress().toString());

		//Create a Customer array of length
		Customer[] custArray = new Customer[1];
		custArray[0] = customer1;
		custArray[1] = customer2;



//Search the array for an Customer having Shipping Address "Chicago"
//If found, print out the Customer's full name

		for (int i = 0; i < custArray.length; i++) {
			String city = custArray[i].getShippingAddress().getCity();
			if (city.equals("Chicago")) {
				System.out.println("Found from Chicago" + custArray[i].toString());

			}
		}
	}

}



