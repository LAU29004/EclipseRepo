package Problem;

public class demo_generic<T> {
	private T data;
	public demo_generic(T data) {
		// TODO Auto-generated constructor stub
		this.data = data;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public static void main(String [] args) {
//		demo_generic d1  = new demo_generic("Hola");
//		System.out.println(d1.getData());
//		demo_generic d2 = new demo_generic(3.14);
//		System.out.println(d2.getData());
//		demo_generic d3 = new demo_generic(new Person("Kim",22));
//		System.out.println(d3.getData());
		demo_generic<String>d1 = new demo_generic<String>("Hello");
		System.out.println(d1.getData());
	}
}
