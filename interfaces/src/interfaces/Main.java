package interfaces;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers= {new SmsLogger(),new EmailLogger(),new DatabaseLogger(),new FileLogger()}; 
		CustomerManager customerManager=new CustomerManager(loggers);
		
		Customer salih=new Customer(1, "Salih", "Bu�ra");
		customerManager.add(salih);
		customerManager.delete(salih);
		

	}

}
