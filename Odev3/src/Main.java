
public class Main {

	public static void main(String[] args) {
		
		User user=new User(1,"Salih Bu�ra","Y�lmaz","babasali60",1234);
		
		UserManager userManager=new UserManager();
		userManager.s�gn(user);
		userManager.add(user);
		
		Instructor �nstructor=new Instructor(2,"Sude","dila","dla",321,"Java Kamp�");
		
		InstructorManager �nstructorManager=new InstructorManager();
		�nstructorManager.Start(�nstructor);
		
		Student student=new Student(3,"baba","sali","tkt",123,"c#","kodlama.io sitesini tasarlay�n");
		
		StudentManager studentManager=new StudentManager();
		studentManager.showStudent(student);
	}

}
