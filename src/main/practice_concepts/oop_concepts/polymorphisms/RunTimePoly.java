package practice_concepts.oop_concepts.polymorphisms;

class ABC {
    public void myMethod() {
        System.out.println("Overridden Method");
    }
}

public class RunTimePoly extends ABC {

    @Override
    public void myMethod() {
        System.out.println("Overriding Method");
    }

    public static void main(String args[]) {
        ABC obj = new RunTimePoly();
        obj.myMethod();


        ABC obj0 = new ABC();
        obj0.myMethod();
// This would call the myMethod() of parent class ABC

        RunTimePoly obj1 = new RunTimePoly();
        obj1.myMethod();
// This would call the myMethod() of child class XYZ

    }
}