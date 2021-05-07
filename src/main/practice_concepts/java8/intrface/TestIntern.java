package practice_concepts.java8.intrface;

public class TestIntern implements Inter1, Inter2{

	//We cannot override static methods from interface
	
	//Compolsory to override this method, because same default method is available in both interface
	// No need to override print2 default method from Inter2, because it is only available in Intern2
	@Override
	public void print() {
		System.out.println("Print from TestIntern");
		// If want to call any specific implementation from two interfaces then call super like below:
		//System.out.println("call interface super :");
		//Inter1.super.print();
		//Inter2.super.print();
	}
	
	@Override
	public int sum(int a, int b) {
		return a+b;
	}

}
