package Problem;
public class Person implements Cloneable{
	private String name;
	private int age;
	public Person() {
		this("Anonymous" , -1); //Constructor chaining : Calling another constructor on same object
	}
	public Person(String name , int age) {
		this.name = name;
		this.age = age;
	}
	public void print() {
		System.out.println("Name: " + name + " , Age: " + age);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person) obj; //Down Casting
			if(this.age == p.age && name.equals(p.name)) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		Person p1 = new Person("Laukik" , 21);
		p1.print();
		Person p2 = new Person("Laukik" , 21);
		p2.print();
		System.out.println("HashCode of p1 Object:" + p1.hashCode());
		System.out.println("HashCode of p2 Object:" + p2.hashCode());
		System.out.println(p1); // It prints class_name@hex_value_of_hash and implicitly call toString()
		System.out.println(p1.equals(p2)); // It checks hashcode if equal or not
		Person pc = (Person)p1.clone();
		System.out.println(pc);
	}
}