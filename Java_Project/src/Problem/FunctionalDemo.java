package Problem;
import java.util.function.*;

public class FunctionalDemo {
	public static void print(Object obj) {
		System.out.println(obj);
	}
	public static void main(String [] args) {
//		Consumer<String> c = (s)->System.out.println(s);
//		c.accept("Adios");
		
//		Consumer<String> c1 = System.out::println;
//		c1.accept("Hello");
//		c1.accept("Hola");
//		c1.accept("Bonjour");
	
//		Consumer<String>c2 = FunctionalDemo::print;
//		c2.accept("Aloha");
		
//		Supplier<String>s1 = () -> "Laukik";
//		System.out.println(s1.get());
		
//		Supplier<Double>s2 = () -> Math.random();
//		System.out.println(s2.get());
		
//		BiConsumer<String,Integer>b1 = (s,i) -> System.out.println("Name is: "+ s+" and Age is:"+ i);
//		b1.accept("Laukik", 21);
		
//		Predicate<Integer>p = (x)->x%2==0;
//		System.out.println(p.test(4));

//		Function<Integer,Integer>square = (x)-> x*x;
//		System.out.println(square.apply(5));
		
		BiFunction<Integer,Integer,Integer>greater = (a,b)-> a>b ? a:b;
		System.out.println(greater.apply(10, 20));
	}
}
