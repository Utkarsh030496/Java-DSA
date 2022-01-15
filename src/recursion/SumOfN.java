package recursion;

public class SumOfN {

	public static void main(String[] args) {
		System.out.println(Sum(50));
	}

	private static int Sum(int n) {
		if(n<=1)
			return n;
		return n+Sum(n-1);
	}

}
