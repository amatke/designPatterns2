package adapterPattern;

public class AdapterPatternDemo {

	public static void main(String[] args) {

		OldCustomer oldCustomer = new OldCustomer();
		oldCustomer.setName("Aleksa Matovic");
		oldCustomer.setAge("19");
		oldCustomer.setAddress("Beograd,Petrovacka,9");

		Customer customer = new CustomerAdapter(oldCustomer);
		System.out.println(customer.getName());
		System.out.println(customer.getAge());
		System.out.println(customer.getAddress());

		//TEST 22ss

	}
}
