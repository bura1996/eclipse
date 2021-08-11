package inh;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer salih=new IndividualCustomer();
		salih.customerNumber="123456";
		
		CorporateCustomer corporateCustomer=new CorporateCustomer();
		corporateCustomer.customerNumber="654321";
		
		
		CustomerManager customerManager=new CustomerManager();
		//Customerin içinde bu klasslar var dedik altta
		Customer[] customers= {salih,corporateCustomer};
		//burada diyor ki sen bana dizi referansı verdin dizi çağırmalısın yada oluşturmalısın
		customerManager.addMultiple(customers);
		

	}

}
