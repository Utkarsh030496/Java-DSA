package recursion;

public class ReverseNumberPrint {

	public static void main(String[] args) {

		printNum(5);

	}

	private static void printNum(int i) {
		 
		if(i<1){
			 return;
		}
		
		System.out.println(i);
		
		printNum(i-1);
		
	}

}
