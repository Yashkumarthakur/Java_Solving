package practice_concepts.oop_concepts.java8_interface;

public interface Inter2 {

	default void print() {
		System.out.println("Print from Inter2");
	}
	
	default void print1() {
		System.out.println("test two default methods from Inter2");
	}
	
	static void testStatic() {
		System.out.println("test static from Intern2");
	}
	
	int sum(int a, int b);
}
