package Problem;
public class subDemo_T<T,P> extends demo_generic<T> {
private P temp;
public subDemo_T(T data , P temp) {
	super(data);
	this.temp = temp;
}
public P getTemp() {
	return temp;
}
public void setTemp(P temp) {
	this.temp = temp;
}
public static void main(String [] args) {
	subDemo_T<String , Integer>sd = new subDemo_T<String , Integer>("Mona",99);
	System.out.println(sd.getData() + "\t" + sd.getTemp());
	subDemo_T<Integer, Person>s2 = new subDemo_T<Integer, Person>(101, new Person("Bol",10));
	System.out.println(s2.getData() + "\t" + s2.getTemp());
}
}
