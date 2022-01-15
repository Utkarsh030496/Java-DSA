package recursion;

public class ProduckOfDigits {

	public static void main(String[] args) {
		System.out.println(Product(102));
	}

	private static int Product(int n) {
		if(n<10)
			return n;
		return (n%10)*(Product(n/10));
	}

}
