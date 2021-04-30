
public class Main {

	public static void main(String[] args) {
		
		User user=new User(1,"Salih Buğra","Yılmaz","babasali60",1234);
		
		UserManager userManager=new UserManager();
		userManager.sıgn(user);
		userManager.add(user);
		
		Instructor ınstructor=new Instructor(2,"Sude","dila","dla",321,"Java Kampı");
		
		InstructorManager ınstructorManager=new InstructorManager();
		ınstructorManager.Start(ınstructor);
		
		Student student=new Student(3,"baba","sali","tkt",123,"c#","kodlama.io sitesini tasarlayın");
		
		StudentManager studentManager=new StudentManager();
		studentManager.showStudent(student);
	}

}
