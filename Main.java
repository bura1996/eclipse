package interfaces;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers= {new SmsLogger(),new EmailLogger(),new FileLogger()};
		CustomerManager customerManager=new CustomerManager(loggers);
		Customer salih=new Customer(1,"Salih","Yýlmaz");//eklemek için müþteri lazým müþteriyi ekledik.
		customerManager.add(salih);

	}

}
