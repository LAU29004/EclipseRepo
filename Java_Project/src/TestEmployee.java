import Office.Clerk;
import Office.Employee;
import Office.Manager;

public class TestEmployee{
public static void main(String[] args) {
//	Employee e = new Employee(1000);
//    System.out.println(e.getSalary());
    Manager m = new Manager(1500,800);
//    System.out.println(m.getSalary());
    Clerk c = new Clerk(1200,400);
//    System.out.println(c.getSalary());
    showSalary(m);
    showSalary(c);
}  
private static void showSalary(Employee e) {
	if(e instanceof Manager) {
		System.out.println("Manager Salary: "+e.getSalary());
	}
	else {
		System.out.println("Clerk Salary: "+e.getSalary());
	}
}
//    private static void showSalary(Clerk c) {
//    	System.out.println("Clerk Salary:"+ c.getSalary());
//    }
//    private static void showSalary(Manager m) {
//    	System.out.println("Manager Salary:"+m.getSalary());
//    }
    //INDIRECT INSTANTIATION OF ABSTRACT CLASS
//    Employee e = m;
//    System.out.println(e.getSalary());
}
