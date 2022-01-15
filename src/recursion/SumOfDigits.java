package recursion;

public class SumOfDigits {

	public static void main(String[] args) {
		System.out.println(Sum(12345));
	}

	private static int Sum(int n) {
		if(n<10)
			return n;
		return n%10 + Sum(n/10);
	}

}
