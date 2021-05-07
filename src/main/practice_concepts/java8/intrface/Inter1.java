package practice_concepts.java8.intrface;

public interface Inter1 {

	default void print() {
		System.out.println("Print from Inter1");
	}
	
	static void testStatic() {
		System.out.println("test static from Intern1");
	}
	
	int sum(int a, int b);
}
