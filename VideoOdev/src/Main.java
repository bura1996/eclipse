import java.util.Date;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrate.NeroCustomerManager;
import Concrate.StarBucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
	BaseCustomerManager baseCustomerManager=new NeroCustomerManager();
	BaseCustomerManager baseCustomerManager2=new StarBucksCustomerManager(new MernisServiceAdapter());
	Customer customer=new Customer();
	customer.setId(1);
	customer.setFirstName("babasali");
	customer.setLastName("60");
	customer.setDateOfBirth(new Date(2002,1,1));
	customer.setNationalityId("123456789");
	
	baseCustomerManager.save(customer);
	
	baseCustomerManager2.save(customer);

	}

}
