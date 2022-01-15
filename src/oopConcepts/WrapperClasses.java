package oopConcepts;

public class WrapperClasses {
	
	public static void main(String[] args) {
		
		Integer a = 10;
        Integer b = 20;

        swap(a, b);

        System.out.println(a + " " + b);
        
        final A utkarsh = new A("Utkarsh Narayan");
        utkarsh.name = "other name";
        System.out.println(utkarsh.name);
        
        A obj = new A("Rnadvsjhv");
        System.out.println(obj);
		
	}
	
	//this swap function will  not be able to swap the Integer values because
	//Integer wrapper class is a final class and once initialized it cannot be changed/modified further
	static void swap(Integer a, Integer b) {
        Integer temp = Integer.valueOf(a); 
        a = Integer.valueOf(b);
        b = Integer.valueOf(temp);
    }
	
}

class A {
    final int num = 10;
    String name;

    public A(String name) {
//        System.out.println("object created");
        this.name = name;
    }
}
