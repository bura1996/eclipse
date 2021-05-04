package Concrate;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarBucksCustomerManager extends BaseCustomerManager{
	CustomerCheckService customerCheckService;
	public StarBucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }
	@Override
	public void save(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {
		System.out.println("Kayýt edildi. "+customer.getFirstName());
		}
		
		else {
			System.out.println("Kaydedilmedi");
		}
		
	}
}
