package recursion;

public class ReverseANumber {

	public static void main(String[] args) {
		reverse(123456);
		System.out.println(sum);
	}
	public static int sum = 0;
	public static void reverse(int n) {
		if(n==0)
			return;
		int rem = n%10;
		sum = sum*10 +rem;
		reverse(n/10);
	}
}
