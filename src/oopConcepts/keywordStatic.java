package oopConcepts;

public class keywordStatic {
	//these are static variables
	static int a = 10;
	static int b;
	
	//this is a static block
	//executes only once during the creation of the first object of the class
	static{
		System.out.println("this is a static block");
		keywordStatic.b = a*10;
	}
	
	public static void main(String[] args) {
		
		keywordStatic a = new keywordStatic();
		keywordStatic b = new keywordStatic();
		
		System.out.println(keywordStatic.a);
		System.out.println(keywordStatic.b);
		keywordStatic.b = 10000;
		System.out.println(keywordStatic.b);

	}

}
