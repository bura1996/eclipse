
public class UserManager {
	
	public void sýgn(User user) {
		System.out.println("kullanýcý adý: "+user.getUser());
		System.out.println("þifre :"+user.getPassword());
	}
	
	
	public void add(User user) {
		System.out.println("Kullanýcý eklendi"+" "+user.getFirstName());
		System.out.println("id :"+user.getId());
	}

	
}
