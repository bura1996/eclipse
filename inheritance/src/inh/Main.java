package inh;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer salih=new IndividualCustomer();
		salih.customerNumber="123456";
		
		CorporateCustomer corporateCustomer=new CorporateCustomer();
		corporateCustomer.customerNumber="654321";
		
		
		CustomerManager customerManager=new CustomerManager();
		//Customerin i�inde bu klasslar var dedik altta
		Customer[] customers= {salih,corporateCustomer};
		//burada diyor ki sen bana dizi referans� verdin dizi �a��rmal�s�n yada olu�turmal�s�n
		customerManager.addMultiple(customers);
		

	}

}
