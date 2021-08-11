package inh;

public class CustomerManager {
	public void add(Customer customers) {
		System.out.println(customers.customerNumber+" kaydedildi");
	}

	
	public void addMultiple(Customer[] customers) {
		for (Customer customer : customers) {
			add(customer);
		}
		
	}
}
