package practice_concepts.oop_concepts.java8_interface;

public class TestOutput {

	public static void main(String[] args) {
		TestIntern obj = new TestIntern();
		//call sum method
		System.out.println("Sum is : " + obj.sum(2, 3));
		
		//call print
		obj.print();
		
		//call default print1 method which is available in Inter2
		obj.print1();
		
		//static method only get called from inerface not from obj
		//static from Inter1
		Inter1.testStatic();
		
		//static method only get called from inerface not from obj
		//static from Inter2
		Inter2.testStatic();
	}
}

/**
 * Output of above main is:
Sum is : 5
Print from TestIntern
test two default methods from Inter2
test static from Intern1
test static from Intern2
*
**/