package Problem;
interface Greeting{
	void sayHello();
}
public class demoClass {
	class GreetingInnerImpl implements Greeting{
		@Override
		public void sayHello(){
			System.out.println("Greeting Inner Impl");
		}
	}
	public void anotherDemo() {
		class GreetingNestedImpl implements Greeting{
			@Override
			public void sayHello() {
				System.out.println("Greeting Nested Impl");
			}
		};
		new GreetingNestedImpl().sayHello();
	}
	public static void main(String[] args) {
		demoClass demo = new demoClass();
		Greeting g1 = demo.new GreetingInnerImpl();
		g1.sayHello();
		demo.anotherDemo();
		
		Greeting g = new Greeting() {  // () => is the constructor of anonymous class
			
			@Override
			public void sayHello() {
				System.out.println("Greeting from Anonymous inner class");
			}
		};
		g.sayHello();
		Greeting greet = () -> System.out.println("Greeting from lambda");
		greet.sayHello();
	}
}
