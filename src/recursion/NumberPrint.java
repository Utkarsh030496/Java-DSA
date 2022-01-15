package recursion;

public class NumberPrint {
	public static void main(String[] args) {
		printNum(500);
	}

	private static void printNum(int n) {
		if(n<1)
			return;
		printNum(n-1);
		System.out.println(n);
	}
}
