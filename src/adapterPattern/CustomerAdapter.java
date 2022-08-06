package adapterPattern;

public class CustomerAdapter extends NewCustomer implements Customer{

	public OldCustomer oldCustomer;

	public CustomerAdapter(OldCustomer oldCustomer){
		this.oldCustomer = oldCustomer;
		adaptData();
	}

	private void adaptData() {
		this.setName(oldCustomer.getName());

		String [] address_parts = oldCustomer.getAddress().split(",");
		Address address = new Address();
		address.setCountry(address_parts[0]);
		address.setStreet(address_parts[1]);
		address.setNumber(Integer.valueOf(address_parts[2].trim()));

		this.setAddress(address);
		this.setAge(Integer.valueOf(oldCustomer.getAge()));
	}
}
