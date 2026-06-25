package Problem;

public class demo_string {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		String s1 = "Hello";
		String s2 = new String("Hello");
		String s3 = "Hello";
//		System.out.println(s1==s2);
//		System.out.println(s1==s3);
//		System.out.println("Using equals function");
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.equals(s3));
//		System.out.println(s1 + "World"); //Here new object is created for new string
		String name = "Lamine";
		String nameRegex = "[A-Z]{1}[a-z]{3,}";
		System.out.println("Person name matching is: "+name.matches(nameRegex));
		String cell = "8653246912";
		String cellRegex = "^[6-9][0-9]{9}";
		System.out.println("Phone number matching is: "+cell.matches(cellRegex));
		String email = "abc@gmail.com";
		String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		System.out.println("Email matching is: "+email.matches(emailRegex));
	}
}
