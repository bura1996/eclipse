
public class UserManager {
	
	public void s�gn(User user) {
		System.out.println("kullan�c� ad�: "+user.getUser());
		System.out.println("�ifre :"+user.getPassword());
	}
	
	
	public void add(User user) {
		System.out.println("Kullan�c� eklendi"+" "+user.getFirstName());
		System.out.println("id :"+user.getId());
	}

	
}
